package com.solvd.flightfinder.entities;

public class Ticket {
	private int ticketId;
	private Flight flight;
	private Passenger passenger;

	public Ticket() {
	}

	public Ticket(int ticketId, Flight flight, Passenger passenger) {
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

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
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
