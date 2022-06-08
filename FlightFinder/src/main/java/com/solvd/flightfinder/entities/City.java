package com.solvd.flightfinder.entities;

public class City {
	private long cityId;
	private String name;
	private Country locationCountry;

	public City() {
	}

	public City(int cityId, String name, Country locationCountry) {
		this.cityId = cityId;
		this.name = name;
		this.setLocationCountry(locationCountry);
	}

	public Country getLocationCountry() {
		return locationCountry;
	}

	public void setLocationCountry(Country locationCountry) {
		this.locationCountry = locationCountry;
	}

	public long getCityId() {
		return cityId;
	}

	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
