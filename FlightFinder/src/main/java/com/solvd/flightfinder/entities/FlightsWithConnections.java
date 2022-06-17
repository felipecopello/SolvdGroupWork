package com.solvd.flightfinder.entities;

import java.util.List;

public class FlightsWithConnections {

    private String flightDistance;
    private int price;
    private List<Airline> airlineList;

    public FlightsWithConnections(String flightDistance, int price, List<Airline> airlineList) {
        this.flightDistance = flightDistance;
        this.price = price;
        this.airlineList = airlineList;
    }

    public FlightsWithConnections() {

    }

    public String getFlightDistance() {
        return flightDistance;
    }

    public void setFlightDistance(String flightDistance) {
        this.flightDistance = flightDistance;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Airline> getAirlineList() {
        return airlineList;
    }

    public void setAirlineList(List<Airline> airlineList) {
        this.airlineList = airlineList;
    }
}
