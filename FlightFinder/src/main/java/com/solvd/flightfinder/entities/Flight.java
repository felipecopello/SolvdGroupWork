package com.solvd.flightfinder.entities;

public class Flight {
	private long flightId;
	private Airport departureAirport;
	private Airport arrivalAirport;
	private String flightDistance;
	private int price;
	private Airline airline;

	public Flight() {
	}

	public Flight(long flightId, Airport departureAirport, Airport arrivalAirport, String flightDistance, int price,
				  Airline airline) {
		this.flightId = flightId;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.flightDistance = flightDistance;
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

	public Airline getAirlineId() {
		return airline;
	}

	public void setAirlineId(Airline airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", departureAirport=" + departureAirport + ", arrivalAirport="
				+ arrivalAirport + ", flightDuration=" + flightDistance + ", price=" + price + ", airline=" + airline
				+ "]";
	}
}
