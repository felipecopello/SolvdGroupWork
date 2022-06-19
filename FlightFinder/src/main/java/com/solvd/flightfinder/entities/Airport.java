package com.solvd.flightfinder.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Airport {
	@JsonProperty
	private long airportId;
	@JsonProperty
	private String name;
	@JsonProperty
	private float latitude;
	@JsonProperty
	private float longitude;
	@JsonProperty
	private City cityLocation;
	public List<Flight> flights = new ArrayList<Flight>();

    public Airport() {
    }


    public Airport(long id) {
        this.airportId = id;
    }

    public Airport(long id, String name, float latitude, float longitude, City cityLocation) {
        this.airportId = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.cityLocation = cityLocation;
    }

    public long getAirportId() {
        return airportId;
    }

    public void setAirportId(long id) {
        this.airportId = id;
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

    @Override
    public String toString() {
        return "Airport [airportId=" + airportId + ", name=" + name + ", latitude=" + latitude + ", longitude="
                + longitude + ", cityLocation=" + cityLocation + "]";
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

}
