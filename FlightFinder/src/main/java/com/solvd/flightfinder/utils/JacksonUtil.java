package com.solvd.flightfinder.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.solvd.flightfinder.Runner;
import com.solvd.flightfinder.entities.Passenger;
import com.solvd.flightfinder.entities.Ticket;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class JacksonUtil {

    private static final Logger LOGGER = LogManager.getLogger(Runner.class);
    private static final ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    public static void writePassenger(Passenger passenger) {

        File file = new File("FlightFinder/src/main/resources/json/passenger.json");
        try {
            objectMapper.writeValue(file, passenger);
            LOGGER.info("The passenger " + passenger.getPassengerId() + " was successfully written in json file.");
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
        }
    }

    public static void writeTicket(Ticket ticket) {
        File file = new File("FlightFinder/main/resources/json/ticket.json");
        try {
            objectMapper.writeValue(file, ticket);
            LOGGER.info("The ticket " + ticket + " was successfully written in json file.");
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
        }
    }

    //    public static void writeFlight(Flight flight) {
//
//        File file = new File("FlightFinder/main/resources/json/flight.json");
//        try {
//            objectMapper.writeValue(file, flight);
//            LOGGER.info("The flight " + flight.getFlightId() + " was successfully written in json file.");
//        } catch (IOException e) {
//            LOGGER.info(e.getMessage());
//        }
//    }

//    public static void writeFlightWithConnection(FlightWithConnection flightWithConnection) {
//
//        File file = new File("FlightFinder/main/resources/json/flight.json");
//        try {
//            objectMapper.writeValue(file, flightWithConnection);
//            LOGGER.info("The flights was successfully written in json file.");
//        } catch (IOException e) {
//            LOGGER.info(e.getMessage());
//        }
//    }

//    public static void mapAirport(String path) {
//        File file = new File(path);
//        try {
//            Airport airport = objectMapper.readValue(file, Airport.class);
//            LOGGER.info(airport);
//
//        } catch (IOException e) {
//            LOGGER.error(e.getStackTrace());
//        }
//    }
//
//    public static void mapAirports(String path) {
//        ObjectMapper om = new ObjectMapper();
//        File file = new File(path);
//        try {
//            JavaType type = om.getTypeFactory().constructCollectionLikeType(List.class, Airport.class);
//            List<Airport> airports = om.readValue(file, type);
//            airports.forEach(LOGGER::info);
//        } catch (Exception e) {
//            LOGGER.info(e.getStackTrace());
//        }
//    }
}
