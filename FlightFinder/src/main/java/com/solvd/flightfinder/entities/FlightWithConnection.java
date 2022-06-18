package com.solvd.flightfinder.entities;

import java.util.List;

public class FlightWithConnection {
	private List<Flight> flights;
	private String flightDistance;
	private int price;

	public FlightWithConnection() {
	}

	public FlightWithConnection(List<Flight> flights) {
	}

	public FlightWithConnection(List<Flight> flights, String flightDistance, int price) {

		this.flightDistance = flightDistance;
		this.price = price;
	}

	public FlightWithConnection(Flight flight, Flight f) {
		// TODO Auto-generated constructor stub
	}

	public String getFlightDistance() {
		return flightDistance;
	}

	public void setFlightDistance(String flightDistance) {
		this.flightDistance = flightDistance;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	@Override
	public String toString() {
		return "FlightWithConnection [flights=" + flights + ", flightDistance=" + flightDistance + ", price=" + price
				+ "]";
	}

}
