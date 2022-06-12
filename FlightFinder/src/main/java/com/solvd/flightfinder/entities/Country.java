package com.solvd.flightfinder.entities;

public class Country {
	private long countryId;
	private String name;

	public Country() {
	}

	public Country(String name) {
		this.name = name;
	}

	public float getCountryId() {
		return countryId;
	}

	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", name=" + name + "]";
	}

}
