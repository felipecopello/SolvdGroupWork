package com.solvd.flightfinder.interfaces;

import com.solvd.flightfinder.entities.Airport;

import java.sql.SQLException;
import java.util.List;

public interface AirportMapper extends IEntityMapper<Airport> {

    List<Airport> getByCity(long city_id) throws SQLException;
}
