package com.solvd.flightfinder.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "flight")
@XmlType(propOrder = { "flightId", "departureAirport", "arrivalAirport", "flightDistance", "price", "airline" })
public class Flight {
	@JsonProperty
	private long flightId;
	@JsonProperty
	private Airport departureAirport;
	@JsonProperty
	private Airport arrivalAirport;

	private String flightDistance;

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

	@XmlAttribute
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	public Airport getDepartureAirport() {
		return departureAirport;
	}

	@XmlElement(name = "departureAirport")
	public void setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
	}

	public Airport getArrivalAirport() {
		return arrivalAirport;
	}

	@XmlElement(name = "arrivalAirport")
	public void setArrivalAirport(Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public String getFlightDistance() {
		return flightDistance;
	}

	@XmlElement(name = "flightDuration")
	public void setFlightDistance(String flightDuration) {
		this.flightDistance = flightDuration;
	}

	public int getPrice() {
		return price;
	}

	@XmlElement(name = "price")
	public void setPrice(int price) {
		this.price = price;
	}

	public Airline getAirline() {
		return airline;
	}

	@XmlElement(name = "airline")
	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", departureAirport=" + departureAirport + ", arrivalAirport="
				+ arrivalAirport + ", flightDistance=" + flightDistance + ", price=" + price + ", airline=" + airline
				+ "]";
	}

}
