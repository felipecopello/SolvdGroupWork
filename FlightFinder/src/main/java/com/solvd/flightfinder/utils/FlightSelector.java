package com.solvd.flightfinder.utils;

import java.util.LinkedList;
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

	public static void flightOptions(String departureAirportId, String arrivalAirportId) {
		FlightMapper flightMapper = (FlightMapper) MyBatisFactory.getMyBatis("flight");

		List<Flight> flightsByDepartureId = flightMapper.getByDepartureAirportId(Long.parseLong(departureAirportId));
		List<Flight> flightsByArrivalId = flightMapper.getByArrivalAirportId(Long.parseLong(arrivalAirportId));

		List<Flight> directFlights = getDirectFlights(flightsByDepartureId, arrivalAirportId);

		if (!directFlights.isEmpty()) {
			LOGGER.info("Your direct flight options are: ");
			directFlights.forEach(f -> LOGGER.info(f.getFlightId()));
		} else {
			LOGGER.info("There are no direct flights to get you there. ");
		}

		List<FlightWithConnection> flightsCombinations = compareFlights(flightsByDepartureId, flightsByArrivalId,
				arrivalAirportId);
		flightsCombinations.forEach(f -> LOGGER.info(f));
	}

	public static List<Flight> getDirectFlights(List<Flight> flightsByDepartureId, String arrivalAirportId) {
		Predicate<Flight> arrivesTo = f -> f.getArrivalAirport().getAirportId() == arrivalAirportId;

		List<Flight> directFlights = flightsByDepartureId.stream().filter(arrivesTo).collect(Collectors.toList());
		return directFlights;
	}

	// Function that returns a list of every possible FlightWithConnection
	// combination. The imput is the lists of flights brought from de db with de
	// departure airport Id, the lists of flights brought from de db with de arival
	// airport Id, and the arrival airport Id.
	public static List<FlightWithConnection> compareFlights(List<Flight> flightsByDepartureId,
			List<Flight> flightsByArrivalId, String arrivalAirportId) {
		List<FlightWithConnection> flightsCombinations = new LinkedList<>();
		for (int i = 0; i < flightsByDepartureId.size(); i++) {
			List<Flight> matchedFlights = comparingFlights(
					flightsByDepartureId.get(i).getArrivalAirport().getAirportId(), arrivalAirportId,
					flightsByArrivalId);
			if (!matchedFlights.isEmpty()) {
				Flight flight = flightsByDepartureId.get(i);
				matchedFlights.forEach(f -> flightsCombinations.add(new FlightWithConnection(flight, f)));
			}
		}
		return flightsCombinations;
	}

	// Function that return the flights that arrive to our destination, and depart
	// from the previous flight destination
	public static List<Flight> comparingFlights(String departureAirportId, String arrivalAirportId,
			List<Flight> flightsByArrivalId) {

		Predicate<Flight> departsFrom = f -> f.getDepartureAirport().getAirportId() == departureAirportId;
		Predicate<Flight> arrivesTo = f -> f.getArrivalAirport().getAirportId() == arrivalAirportId;

		List<Flight> matchedFlights = flightsByArrivalId.stream().filter(departsFrom.and(arrivesTo))
				.collect(Collectors.toList());
		return matchedFlights;
	}

}
