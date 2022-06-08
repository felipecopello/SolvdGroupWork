package com.solvd.flightfinder.entities;

public class Airport {
	private long airportId;
	private String name;
	private float latitude;
	private float longitude;
	private City cityLocation;

	public Airport() {
	}

	public Airport(long airportId, String name, float latitude, float longitude, City cityLocation) {
		this.airportId = airportId;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.cityLocation = cityLocation;
	}

	public long getAirportId() {
		return airportId;
	}

	public void setAirportId(long airportId) {
		this.airportId = airportId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public City getCityLocation() {
		return cityLocation;
	}

	public void setCityLocation(City cityLocation) {
		this.cityLocation = cityLocation;
	}

}
