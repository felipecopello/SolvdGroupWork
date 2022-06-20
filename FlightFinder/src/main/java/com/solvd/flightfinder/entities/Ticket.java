package com.solvd.flightfinder.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "flightWithConnection")
@XmlType(propOrder = { "ticketId", "flight", "passenger" })
public class Ticket {
	@JsonProperty
	private int ticketId;
	@JsonProperty
	private FlightWithConnection flight;
	@JsonProperty
	private Passenger passenger;

	public Ticket() {
	}

	public Ticket(int ticketId, FlightWithConnection flight, Passenger passenger) {
		this.ticketId = ticketId;
		this.flight = flight;
		this.passenger = passenger;
	}

	public int getTicketId() {
		return ticketId;
	}

	@XmlAttribute
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public FlightWithConnection getFlight() {
		return flight;
	}

	@XmlElement(name = "flight")
	public void setFlight(FlightWithConnection flight) {
		this.flight = flight;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	@XmlElement(name = "passenger")
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", flight=" + flight + ", passenger=" + passenger + "]";
	}
}
