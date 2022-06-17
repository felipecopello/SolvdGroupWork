package com.solvd.flightfinder.entities;

import java.util.List;

public class AirlineInAirport {
    private int airlineId;
    private int airportId;
    private Airline airline;
    private List<Airport> airports;

    public AirlineInAirport(int airlineId, int airportId) {
        this.airlineId = airlineId;
        this.airportId = airportId;
    }

    public AirlineInAirport(Airline airline, List<Airport> airports) {
        this.airline = airline;
        this.airports = airports;
    }

    public AirlineInAirport() {
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

    public int getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(int airlineId) {
        this.airlineId = airlineId;
    }

    public int getAirportId() {
        return airportId;
    }

    public void setAirportId(int airportId) {
        this.airportId = airportId;
    }

}
