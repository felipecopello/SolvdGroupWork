package com.solvd.flightfinder.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import com.solvd.flightfinder.entities.Airport;
import com.solvd.flightfinder.entities.Flight;
import com.solvd.flightfinder.interfaces.FlightMapper;

public class FlightPathFinder {
	private List<Flight> flights = new ArrayList<Flight>();
	private Map<String, Airport> airports = new HashMap<String, Airport>();
	FlightMapper flightMapper = (FlightMapper) MyBatisFactory.getMyBatis("flight");

	public FlightPathFinder() throws Exception {
		flights = flightMapper.getAll();

		for (Flight flight : flights) {
			String departureId = flight.getDepartureAirport().getAirportId();
			if (!airports.containsKey(departureId)) {
				Airport airport = new Airport(departureId);
				airport.flights.add(flight);
				airports.put(departureId, airport);
			} else {
				Airport airport = airports.get(departureId);
				airport.flights.add(flight);
			}
		}
	}

	public List<Flight> findRoute(String originId, String destinationId) {

		Queue<Airport> queue = new LinkedList<Airport>();
		Map<Airport, Flight> backtrack = new HashMap<Airport, Flight>();
		Airport originAirport = this.airports.get(originId);
		List<Flight> finalFlight = new ArrayList<>();
		if (originAirport == null)
			return null; // origin airport not found - no solution
		queue.add(originAirport); // si existe tal cosa lo agrego al queue
		while (!queue.isEmpty()) {
			Airport airport = queue.remove(); // lo saca para analizarlo
			if (airport == null)// si es nulo sale del loop
				break;
			if (airport.getAirportId().equals(destinationId)) {// Made it to destination; create the route and return it
				while (airport != originAirport) {
					Flight flight = backtrack.get(airport);
					finalFlight.add(flight);
					airport = airports.get(flight.getDepartureAirport().getAirportId());
				}
				Collections.reverse(finalFlight);
				return finalFlight;
			}
			// enqueue all new airports reachable from this airport.
			// record the flight that got us there in backtrack.
			for (Flight flt : airport.flights) {
				Airport destinationAirport = airports.get(flt.getArrivalAirport().getAirportId());
				if (backtrack.containsKey(destinationAirport))
					continue; // we've been to this destination before - ignore
				backtrack.put(destinationAirport, flt);
				queue.add(destinationAirport);
			}
		}
		// if we're here, we didn't find anything.
		return null;
	}

	public static void main(String[] args) {
		try {
			FlightPathFinder maxim = new FlightPathFinder();
			List<Flight> r = maxim.findRoute("1", "5"); // tests a single origin/destination pair
			if (r == null) {
				System.out.println("No route found");
			} else {
				System.out.println(Arrays.deepToString(r.toArray()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
