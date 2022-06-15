package com.solvd.flightfinder.interfaces;

import java.util.List;

import com.solvd.flightfinder.entities.Flight;

public interface FlightMapper extends IEntityMapper<Flight> {

	public List<Flight> getByDepartureAirportId(long departureAirportId);

	public List<Flight> getByArrivalAirportId(long arrivalAirportId);
}
