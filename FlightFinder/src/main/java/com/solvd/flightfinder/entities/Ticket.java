package com.solvd.flightfinder.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

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

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

	public FlightWithConnection getFlight() {
		return flight;
	}

	public void setFlight(FlightWithConnection flight) {
		this.flight = flight;
	}

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Ticket [ticketId=" + ticketId + ", flight=" + flight + ", passenger=" + passenger + "]";
    }
}
