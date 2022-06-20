package com.solvd.flightfinder.utils;

import com.solvd.flightfinder.entities.Flight;
import com.solvd.flightfinder.entities.FlightWithConnection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FlightSelector {

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

                Flight flight = flightsByDepartureId.get(i);
                matchedFlights.forEach(f -> flightsWithConnections.add(new FlightWithConnection(flight, f)));

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
}