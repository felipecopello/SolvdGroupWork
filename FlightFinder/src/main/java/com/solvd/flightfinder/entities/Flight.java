package com.solvd.flightfinder.entities;

public class Flight {
	private long flightId;
	private Airport departureAirport;
	private Airport arrivalAirport;
	private String flightDuration;
	private int price;
	private Airline airline;

	public Flight() {
	}

	public Flight(long flightId, Airport departureAirport, Airport arrivalAirport, String flightDuration, int price,
			Airline airline) {
		this.flightId = flightId;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.flightDuration = flightDuration;
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

	public String getFlightDuration() {
		return flightDuration;
	}

	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
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
				+ arrivalAirport + ", flightDuration=" + flightDuration + ", price=" + price + ", airline=" + airline
				+ "]";
	}
}
