package com.solvd.flightfinder.entities;

public class Airline {
	private long airlineId;
	private String name;

	public Airline() {
	}

	public Airline(long airlineId, String name) {
		this.airlineId = airlineId;
		this.name = name;
	}

	public long getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(long airlineId) {
		this.airlineId = airlineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
