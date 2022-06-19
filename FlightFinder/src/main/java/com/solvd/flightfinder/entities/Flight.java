package com.solvd.flightfinder.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Flight {
	@JsonProperty
	private long flightId;
	@JsonProperty
	private Airport departureAirport;
	@JsonProperty
	private Airport arrivalAirport;
	@JsonProperty
	private int price;
	@JsonProperty
	private Airline airline;

	public Flight() {
	}

	public Flight(long flightId, Airport departureAirport, Airport arrivalAirport, int price, Airline airline) {
		this.flightId = flightId;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.price = price;
		this.airline = airline;
	}

	public long getFlightId() {
		return flightId;
	}

	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	public Airport getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
	}

	public Airport getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Airline getAirlineId() {
		return airline;
	}

	public void setAirlineId(Airline airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", departureAirport=" + departureAirport + ", arrivalAirport="
				+ arrivalAirport + ", price=" + price + ", airline=" + airline
				+ "]";
	}
}
