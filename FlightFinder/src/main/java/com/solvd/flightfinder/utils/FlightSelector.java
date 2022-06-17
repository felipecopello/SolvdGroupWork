package com.solvd.flightfinder.utils;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.flightfinder.MyBatisTrialRunner;
import com.solvd.flightfinder.entities.Flight;
import com.solvd.flightfinder.interfaces.FlightMapper;

public class FlightSelector {
	private static final Logger LOGGER = LogManager.getLogger(MyBatisTrialRunner.class);

	public static void flightOptions(long departureAirportId, long arrivalAirportId) {
		FlightMapper flightMapper = (FlightMapper) MyBatisFactory.getMyBatis("flight");

		List<Flight> flightsByDepartureId = flightMapper.getByDepartureAirportId(departureAirportId);
		List<Flight> flightsByArrivalId = flightMapper.getByArrivalAirportId(arrivalAirportId);

		List<Flight> directFlights = getDirectFlights(flightsByDepartureId, arrivalAirportId);

		if (!directFlights.isEmpty()) {
			LOGGER.info("Your direct flight options are: ");
			directFlights.forEach(f -> LOGGER.info(f.getFlightId()));
		} else {
			LOGGER.info("There are no direct flights to get you there. ");
		}

		compareFlights(flightsByDepartureId, flightsByArrivalId, arrivalAirportId);

	}

	public static List<Flight> getDirectFlights(List<Flight> flightsByDepartureId, long arrivalAirportId) {
		Predicate<Flight> arrivesTo = f -> f.getArrivalAirport().getAirportId() == arrivalAirportId;

		List<Flight> directFlights = flightsByDepartureId.stream().filter(arrivesTo).collect(Collectors.toList());
		return directFlights;
	}

	public static void compareFlights(List<Flight> flightsByDepartureId, List<Flight> flightsByArrivalId,
			long arrivalAirportId) {
		for (int i = 0; i < flightsByDepartureId.size(); i++) {
			List<Flight> matchedFlights = comparingFlights(
					flightsByDepartureId.get(i).getArrivalAirport().getAirportId(), arrivalAirportId,
					flightsByArrivalId);
			if (!matchedFlights.isEmpty()) {
				LOGGER.info("You can combine flight ´{}´. With:", flightsByDepartureId.get(i).getFlightId());
				matchedFlights.forEach(f -> LOGGER.info(f.getFlightId()));
			}
		}
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

		flightOptions(departureAirportId, arrivalAirportId);

	}
}
