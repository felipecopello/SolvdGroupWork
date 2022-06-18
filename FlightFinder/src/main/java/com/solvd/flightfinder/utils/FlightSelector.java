package com.solvd.flightfinder.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.flightfinder.MyBatisTrialRunner;
import com.solvd.flightfinder.entities.Flight;
import com.solvd.flightfinder.entities.FlightWithConnection;
import com.solvd.flightfinder.interfaces.FlightMapper;

public class FlightSelector {
	private static final Logger LOGGER = LogManager.getLogger(MyBatisTrialRunner.class);

	public static List<Flight> getDirectFlights(List<Flight> flightsByDepartureId, long arrivalAirportId) {
		Predicate<Flight> arrivesTo = f -> f.getArrivalAirport().getAirportId() == arrivalAirportId;

		List<Flight> directFlights = flightsByDepartureId.stream().filter(arrivesTo).collect(Collectors.toList());
		return directFlights;
	}

	public static List<FlightWithConnection> compareFlights(List<Flight> flightsByDepartureId,
			List<Flight> flightsByArrivalId, long arrivalAirportId) {

		List<FlightWithConnection> flightsWithConnections = new ArrayList<>();

		for (int i = 0; i < flightsByDepartureId.size(); i++) {
			List<Flight> matchedFlights = comparingFlights(
					flightsByDepartureId.get(i).getArrivalAirport().getAirportId(), arrivalAirportId,
					flightsByArrivalId);
			if (!matchedFlights.isEmpty()) {
				Flight departureFlight = flightsByDepartureId.get(i);
				for (Flight flt : matchedFlights) {
					FlightWithConnection flightWithConnection = new FlightWithConnection(departureFlight, flt);
					flightsWithConnections.add(flightWithConnection);
				}
			}
		}
		return flightsWithConnections;
	}

	// Function that return the flights that arrive to our destination, and depart
	// from the previous flight destination
	public static List<Flight> comparingFlights(long departureAirportId, long arrivalAirportId,
			List<Flight> flightsByArrivalId) {

		Predicate<Flight> departsFrom = f -> f.getDepartureAirport().getAirportId() == departureAirportId;
		Predicate<Flight> arrivesTo = f -> f.getArrivalAirport().getAirportId() == arrivalAirportId;

		List<Flight> matchedFlights = flightsByArrivalId.stream().filter(departsFrom.and(arrivesTo))
				.collect(Collectors.toList());
		return matchedFlights;
	}

	public static void main(String[] arg) {
		long departureAirportId = 1;
		long arrivalAirportId = 6;

		FlightMapper flightMapper = (FlightMapper) MyBatisFactory.getMyBatis("flight");

		List<Flight> flightsByDepartureId = flightMapper.getByDepartureAirportId(departureAirportId);
		List<Flight> flightsByArrivalId = flightMapper.getByArrivalAirportId(arrivalAirportId);

		List<Flight> directFlights = getDirectFlights(flightsByDepartureId, arrivalAirportId);
		LOGGER.info("Direct Flight options:");
		directFlights.forEach(f -> LOGGER.info(f.getFlightId()));

		LOGGER.info("Connection Flight options:");
		List<FlightWithConnection> flightsWithConnections = compareFlights(flightsByDepartureId, flightsByArrivalId,
				arrivalAirportId);
		flightsWithConnections.forEach(fwc -> LOGGER.info(fwc));
	}
}