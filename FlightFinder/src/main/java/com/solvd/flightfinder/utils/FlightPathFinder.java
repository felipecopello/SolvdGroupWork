package com.solvd.flightfinder.utils;

//public class FlightPathFinder {
//	private List<Flight> flights = new ArrayList<Flight>();
//	private static Map<String, Airport> airports = new HashMap<String, Airport>();
//	FlightMapper flightMapper = (FlightMapper) MyBatisFactory.getMyBatis("flight");
//
//	public FlightPathFinder() throws Exception {
//		flights = flightMapper.getAll();
//
//		for (Flight flight : flights) {
//			String departureId = flight.getDepartureAirport().getAirportId();
//			if (!airports.containsKey(departureId)) {
//				Airport airport = new Airport(departureId);
//				airport.flights.add(flight);
//				airports.put(departureId, airport);
//			} else {
//				Airport airport = airports.get(departureId);
//				airport.flights.add(flight);
//			}
//		}
//	}
//
//	public static void clearAirportsFlightLists() {
//		for (Entry<String, Airport> airportMap : airports.entrySet()) {
//			airportMap.getValue().getFlights().clear();
//		}
//	}
//
//	public static void repopulateAirports(List<Flight> flights) {
//		clearAirportsFlightLists();
//		for (Flight flight : flights) {
//			String departureId = flight.getDepartureAirport().getAirportId();
//			if (airports.containsKey(departureId)) {
//				Airport airport = airports.get(departureId);
//				airport.flights.add(flight);
//			}
//		}
//	}
//
//	public List<List<Flight>> findRoute(String originId, String destinationId) {
//		List<List<Flight>> finalFlightsList = new LinkedList<>();
//		Queue<Airport> queue = new LinkedList<Airport>();
//		Map<Airport, Flight> backtrack = new HashMap<Airport, Flight>();
//		Airport originAirport = FlightPathFinder.airports.get(originId);
//		List<Flight> finalFlight = new ArrayList<>();
//		if (originAirport == null)
//			return null; // origin airport not found - no solution
//		queue.add(originAirport); // si existe tal cosa lo agrego al queue
//		while (!queue.isEmpty()) {
//			Airport airport = queue.remove(); // lo saca para analizarlo
//			if (airport == null)// si es nulo sale del loop
//				break;
//			if (airport.getAirportId().equals(destinationId)) {// Made it to destination; create the route and return it
//				while (airport != originAirport) {
//					Flight flight = backtrack.get(airport);
//					finalFlight.add(flight);
//
//					airport = airports.get(flight.getDepartureAirport().getAirportId());
//				}
//				Collections.reverse(finalFlight);
//				if (!finalFlightsList.contains(finalFlight)) {
//					finalFlightsList.add(finalFlight);
//					flights.remove(finalFlight.get(finalFlight.size() - 1));
//					repopulateAirports(flights);
//					backtrack.clear();
//					queue.clear();
//					queue.add(originAirport);
//				}
//			}
//			// enqueue all new airports reachable from this airport.
//			// record the flight that got us there in backtrack.
//			for (Flight flt : airport.flights) {
//				Airport destinationAirport = airports.get(flt.getArrivalAirport().getAirportId());
//				if (backtrack.containsKey(destinationAirport))
//					continue; // we've been to this destination before - ignore
//				backtrack.put(destinationAirport, flt);
//				queue.add(destinationAirport);
//			}
//		}
//		return finalFlightsList;
//	}
//
//	public static void main(String[] args) {
//		try {
//			FlightPathFinder maxim = new FlightPathFinder();
//			List<List<Flight>> r = maxim.findRoute("1", "6"); // tests a single origin/destination pair
//			if (r == null) {
//				System.out.println("No route found");
//			} else {
//				System.out.println(Arrays.deepToString(r.toArray()));
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
