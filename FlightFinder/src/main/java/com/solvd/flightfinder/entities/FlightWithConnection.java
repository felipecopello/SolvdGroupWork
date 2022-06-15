package com.solvd.flightfinder.entities;

public class FlightWithConnection {
	private Flight firstFlight;
	private Flight secondFlight;
	private String flightDistance;
	private int price;

	public FlightWithConnection() {
	}

	public FlightWithConnection(Flight firstFlight, Flight secondFlight) {
		this.firstFlight = firstFlight;
		this.secondFlight = secondFlight;
	}

	public FlightWithConnection(Flight firstFlight, Flight secondFlight, String flightDistance, int price) {
		this.firstFlight = firstFlight;
		this.secondFlight = secondFlight;
		this.flightDistance = flightDistance;
		this.price = price;
	}

	public Flight getFirstFlight() {
		return firstFlight;
	}

	public void setFirstFlight(Flight firstFlight) {
		this.firstFlight = firstFlight;
	}

	public Flight getSecondFlight() {
		return secondFlight;
	}

	public void setSecondFlight(Flight secondFlight) {
		this.secondFlight = secondFlight;
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

	@Override
	public String toString() {
		return "FlightWithConnection [firstFlight=" + firstFlight + ", secondFlight=" + secondFlight
				+ ", flightDistance=" + flightDistance + ", price=" + price + "]";
	}
}
