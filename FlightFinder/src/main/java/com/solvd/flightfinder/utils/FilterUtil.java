package com.solvd.flightfinder.utils;

import com.solvd.flightfinder.entities.Airport;
import com.solvd.flightfinder.entities.Flight;

import java.util.List;

public class FilterUtil {

    //gets the total of price and distance from a flights list
    public static Flight joinFlights(List<Flight> flightList) {
        Flight bigFlight = new Flight();
        int price = 0;
        double distance = 0;
        for (Flight flight: flightList){
            price = price + flight.getPrice();
            Airport departure = flight.getDepartureAirport();
            Airport arrival = flight.getArrivalAirport();
            distance = distance + GeoDistanceCalculator.distance(departure.getLatitude(), departure.getLongitude(), arrival.getLatitude(), arrival.getLongitude());
        }
        String distanceString = String.valueOf(distance);
        bigFlight.setPrice(price);
        bigFlight.setFlightDistance(distanceString);
        return bigFlight;
    }

    public static int getCheapestBigFlight(List<Flight> flightList) {
        Flight cheapestBigFlight = new Flight();
        int price = flightList.get(0).getPrice();
        for (Flight flight: flightList){
            if (flight.getPrice() < price) {
                price = flight.getPrice();
            }
        }
        return price;
    }

    public static String getShortestBigFlight(List<Flight> flightList) {
        Flight cheapestBigFlight = new Flight();
        Double distance = Double.parseDouble(flightList.get(0).getFlightDistance());
        for (Flight flight: flightList){
            double flightDouble = Double.parseDouble(flight.getFlightDistance());
            if (flightDouble > distance) {
                distance = flightDouble;
            }
        }
        return String.valueOf(distance);
    }
}
