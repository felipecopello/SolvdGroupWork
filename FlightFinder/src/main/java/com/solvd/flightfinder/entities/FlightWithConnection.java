package com.solvd.flightfinder.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "flightWithConnection")
@XmlType(propOrder = { "departureFlight", "arrivalFlight", "flightDistance", "price" })
public class FlightWithConnection {
	@JsonProperty
	private Flight departureFlight;
	@JsonProperty
	private Flight arrivalFlight;
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

	@XmlElement(name = "flightDistance")
	public void setFlightDistance(String flightDistance) {
		this.flightDistance = flightDistance;
	}

	public int getPrice() {
		return price;
	}

	@XmlElement(name = "price")
	public void setPrice(int price) {
		this.price = price;
	}

	public Flight getArrivalFlight() {
		return arrivalFlight;
	}

	@XmlElement(name = "arrivalFlight")
	public void setArrivalFlight(Flight arrivalFlight) {
		this.arrivalFlight = arrivalFlight;
	}

	public Flight getDepartureFlight() {
		return departureFlight;
	}

	@XmlElement(name = "departureFlight")
	public void setDepartureFlight(Flight departureFlight) {
		this.departureFlight = departureFlight;
	}

	@Override
	public String toString() {
		return "FlightWithConnection [departureFlight=" + departureFlight + ", arrivalFlight=" + arrivalFlight
				+ ", flightDistance=" + flightDistance + ", price=" + price + "]";
	}

}
