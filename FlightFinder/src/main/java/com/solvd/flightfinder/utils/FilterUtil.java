package com.solvd.flightfinder.utils;

import com.solvd.flightfinder.entities.Airport;
import com.solvd.flightfinder.entities.Flight;
import com.solvd.flightfinder.entities.FlightsWithConnections;

import java.util.List;

public class FilterUtil {

    //gets the total of price and distance from a flights list
    public static FlightsWithConnections joinFlights(List<Flight> flightList) {
        FlightsWithConnections flightsWithConnections = new FlightsWithConnections();
        int price = 0;
        double distance = 0;
        for (Flight flight: flightList){
            price = price + flight.getPrice();
            Airport departure = flight.getDepartureAirport();
            Airport arrival = flight.getArrivalAirport();
            distance = distance + GeoDistanceCalculator.distance(departure.getLatitude(), departure.getLongitude(), arrival.getLatitude(), arrival.getLongitude());
        }
        String distanceString = String.valueOf(distance);
        flightsWithConnections.setPrice(price);
        flightsWithConnections.setFlightDistance(distanceString);
        return flightsWithConnections;
    }

    public static int getCheapestBigFlight(List<FlightsWithConnections> flightList) {
        FlightsWithConnections cheapestBigFlight = new FlightsWithConnections();
        int price = flightList.get(0).getPrice();
        for (FlightsWithConnections flightsWithConnections: flightList){
            if (flightsWithConnections.getPrice() < price) {
                price = flightsWithConnections.getPrice();
            }
        }
        return price;
    }

    public static String getShortestBigFlight(List<FlightsWithConnections> flightList) {
        FlightsWithConnections cheapestBigFlight = new FlightsWithConnections();
        Double distance = Double.parseDouble(flightList.get(0).getFlightDistance());
        for (FlightsWithConnections flightsWithConnections: flightList){
            double flightDouble = Double.parseDouble(flightsWithConnections.getFlightDistance());
            if (flightDouble > distance) {
                distance = flightDouble;
            }
        }
        return String.valueOf(distance);
    }
}
