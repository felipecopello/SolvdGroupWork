package com.solvd.flightfinder.interfaces;

import com.solvd.flightfinder.entities.Flight;

import java.util.List;

public interface FlightMapper extends IEntityMapper<Flight> {

    public List<Flight> getByDepartureAirportId(long departureAirportId);

    public List<Flight> getByArrivalAirportId(long arrivalAirportId);
}
