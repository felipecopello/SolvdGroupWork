package com.solvd.flightfinder.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.solvd.flightfinder.Runner;
import com.solvd.flightfinder.entities.Airport;
import com.solvd.flightfinder.entities.Flight;
import com.solvd.flightfinder.entities.FlightWithConnection;
import com.solvd.flightfinder.entities.Passenger;
import com.solvd.flightfinder.entities.Ticket;

public class JacksonUtil {

	private static final Logger LOGGER = LogManager.getLogger(Runner.class);
	private static final ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

	public static void writePassenger(Passenger passenger, String path) {

		File file = new File(path);
		try {
			objectMapper.writeValue(file, passenger);
			LOGGER.info("The passenger " + passenger.getPassengerId() + " was successfully written in json file.");
		} catch (IOException e) {
			LOGGER.info(e.getMessage());
		}
	}

	public static void writeTicket(Ticket ticket, String path) {
		File file = new File(path);
		try {
			objectMapper.writeValue(file, ticket);
			LOGGER.info("The ticket " + ticket + " was successfully written in json file.");
		} catch (IOException e) {
			LOGGER.info(e.getMessage());
		}
	}

	public static void writeFlight(Flight flight, String path) {

		File file = new File(path);
		try {
			objectMapper.writeValue(file, flight);
			LOGGER.info("The flight " + flight.getFlightId() + " was successfully written in json file.");
		} catch (IOException e) {
			LOGGER.info(e.getMessage());
		}
	}

	public static void writeFlightWithConnection(FlightWithConnection flightWithConnection, String path) {

		File file = new File(path);
		try {
			objectMapper.writeValue(file, flightWithConnection);
			LOGGER.info("The flights was successfully written in json file.");
		} catch (IOException e) {
			LOGGER.info(e.getMessage());
		}
	}

	public static void mapAirport(String path) {
		File file = new File(path);
		try {
			Airport airport = objectMapper.readValue(file, Airport.class);
			LOGGER.info(airport);

		} catch (IOException e) {
			LOGGER.error(e.getStackTrace());
		}
	}

	public static void mapAirports(String path) {
		ObjectMapper om = new ObjectMapper();
		File file = new File(path);
		try {
			JavaType type = om.getTypeFactory().constructCollectionLikeType(List.class, Airport.class);
			List<Airport> airports = om.readValue(file, type);
			airports.forEach(LOGGER::info);
		} catch (Exception e) {
			LOGGER.info(e.getStackTrace());
		}
	}
}
