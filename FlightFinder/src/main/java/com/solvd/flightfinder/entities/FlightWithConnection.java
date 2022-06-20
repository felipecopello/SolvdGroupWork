package com.solvd.flightfinder.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightWithConnection {
	@JsonProperty
	private Flight departureFlight;
	@JsonProperty
	private Flight arrivalFlight;
//	private List<Flight> flights;
	@JsonProperty
	private String flightDistance;
	@JsonProperty
	private int price;

	public FlightWithConnection() {
	}

	public FlightWithConnection(Flight departureFlight, Flight arrivalFlight) {
		this.departureFlight = departureFlight;
		this.arrivalFlight = arrivalFlight;
	}

	public FlightWithConnection(List<Flight> flights) {
	}

	public FlightWithConnection(List<Flight> flights, String flightDistance, int price) {

		this.flightDistance = flightDistance;
		this.price = price;
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

//	public List<Flight> getFlights() {
//		return flights;
//	}
//
//	public void setFlights(List<Flight> flights) {
//		this.flights = flights;
//	}

	public Flight getArrivalFlight() {
		return arrivalFlight;
	}

	public void setArrivalFlight(Flight arrivalFlight) {
		this.arrivalFlight = arrivalFlight;
	}

	public Flight getDepartureFlight() {
		return departureFlight;
	}

	public void setDepartureFlight(Flight departureFlight) {
		this.departureFlight = departureFlight;
	}

	@Override
	public String toString() {
		return "FlightWithConnection [departureFlight=" + departureFlight + ", arrivalFlight=" + arrivalFlight
				+ ", flightDistance=" + flightDistance + ", price=" + price + "]";
	}

}
