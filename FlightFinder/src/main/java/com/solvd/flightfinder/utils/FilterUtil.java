package com.solvd.flightfinder.utils;

import com.solvd.flightfinder.entities.Airport;
import com.solvd.flightfinder.entities.Flight;
import com.solvd.flightfinder.entities.FlightWithConnection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class FilterUtil {
    private final static Logger LOGGER = LogManager.getLogger(FilterUtil.class);

    //gets the total of price and distance from a flights list
    public static List<FlightWithConnection> joinFlights(List<FlightWithConnection> flightList) {
        int price = 0;
        double distance = 0;
        for (FlightWithConnection flight : flightList) {
            price = price + flight.getPrice();
            Airport departure1 = flight.getDepartureFlight().getDepartureAirport();
            Airport arrival1 = flight.getDepartureFlight().getArrivalAirport();
            Airport departure2 = flight.getArrivalFlight().getDepartureAirport();
            Airport arrival2 = flight.getArrivalFlight().getArrivalAirport();
            distance = distance + GeoDistanceCalculator.distance(departure1.getLatitude(), departure1.getLongitude(), arrival1.getLatitude(), arrival1.getLongitude()) +
                    GeoDistanceCalculator.distance(departure2.getLatitude(), departure2.getLongitude(), arrival2.getLatitude(), arrival2.getLongitude());
            String distanceString = String.valueOf(distance);
            flight.setFlightDistance(distanceString);
        }
        return flightList;
    }

    public static int getCheapestBigFlight(List<FlightWithConnection> flightList) {
        FlightWithConnection cheapest = new FlightWithConnection();
        int optionCounter = 0;
        int optionNumber = 0;
        int price = flightList.get(0).getPrice();
        for (FlightWithConnection flightsWithConnection : flightList) {
            ++optionCounter;
            if (flightsWithConnection.getPrice() < price) {
                price = flightsWithConnection.getPrice();
                optionNumber = optionCounter;
            }
        }
        return price;
    }

    public static void getShortestBigFlight(List<FlightWithConnection> flightList) {
        int optionCounter = 0;
        int optionNumber = 0;
        FlightWithConnection shortest = new FlightWithConnection();
        Double distance = Double.parseDouble(flightList.get(0).getFlightDistance());
        for (FlightWithConnection flightsWithConnection : flightList) {
            ++optionCounter;
            double flightDouble = Double.parseDouble(flightsWithConnection.getFlightDistance());
            if (flightDouble > distance) {
                distance = flightDouble;
                optionNumber = optionCounter;
            }
        }
        LOGGER.info("The shortest travel option is " + optionNumber + " with a distance of: " + distance);
    }

    public static void selectPrice(List<FlightWithConnection> fwc, List<Flight> f) {
        long cheapestId = 0;
        long cheapestArrivalId = 0;
        long cheapestDirectId = 0;
        int price = fwc.get(0).getPrice();
        for (FlightWithConnection flightsWithConnection : fwc) {
            if (flightsWithConnection.getPrice() < price) {
                price = flightsWithConnection.getPrice();
                cheapestId = flightsWithConnection.getDepartureFlight().getFlightId();
                cheapestArrivalId = flightsWithConnection.getArrivalFlight().getFlightId();
            }
        }
        int directPrice = f.get(0).getPrice();
        for (Flight flight : f) {
            if (flight.getPrice() <= directPrice) {
                directPrice = flight.getPrice();
                cheapestDirectId = flight.getFlightId();
            }
        }
        if (directPrice < price) {
            LOGGER.info("The cheapest travel option is the direct flight: " + cheapestDirectId + " with a price of: "
                    + directPrice);
        } else {
            LOGGER.info("The cheapest travel option is the combination flight: " + cheapestId + "and :" + cheapestArrivalId + " with a price of: "
                    + price);
        }
    }
}
