package com.solvd.flightfinder.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Airline {
	@JsonProperty
	private long airlineId;
	@JsonProperty
	private String name;

	public Airline() {
	}

	public Airline(long id, String name) {
		this.airlineId = id;
		this.name = name;
	}

	public long getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(long id) {
		this.airlineId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Airline [id=" + airlineId + ", name=" + name + "]";
	}
}
