package com.solvd.flightfinder.utils;

import com.solvd.flightfinder.entities.Airport;
import com.solvd.flightfinder.entities.Flight;
import com.solvd.flightfinder.entities.FlightWithConnection;

import java.util.List;

public class FilterUtil {

    //gets the total of price and distance from a flights list
    public static FlightWithConnection joinFlights(List<Flight> flightList) {
        FlightWithConnection flightsWithConnection = new FlightWithConnection();
        int price = 0;
        double distance = 0;
        for (Flight flight : flightList) {
            price = price + flight.getPrice();
            Airport departure = flight.getDepartureAirport();
            Airport arrival = flight.getArrivalAirport();
            distance = distance + GeoDistanceCalculator.distance(departure.getLatitude(), departure.getLongitude(), arrival.getLatitude(), arrival.getLongitude());
        }
        String distanceString = String.valueOf(distance);
        flightsWithConnection.setPrice(price);
        flightsWithConnection.setFlightDistance(distanceString);
        return flightsWithConnection;
    }

    public static int getCheapestBigFlight(List<FlightWithConnection> flightList) {
        FlightWithConnection cheapestBigFlight = new FlightWithConnection();
        int price = flightList.get(0).getPrice();
        for (FlightWithConnection flightsWithConnection : flightList) {
            if (flightsWithConnection.getPrice() < price) {
                price = flightsWithConnection.getPrice();
            }
        }
        return price;
    }

    public static String getShortestBigFlight(List<FlightWithConnection> flightList) {
        FlightWithConnection cheapestBigFlight = new FlightWithConnection();
        Double distance = Double.parseDouble(flightList.get(0).getFlightDistance());
        for (FlightWithConnection flightsWithConnection : flightList) {
            double flightDouble = Double.parseDouble(flightsWithConnection.getFlightDistance());
            if (flightDouble > distance) {
                distance = flightDouble;
            }
        }
        return String.valueOf(distance);
    }
}
