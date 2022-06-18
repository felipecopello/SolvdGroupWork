package com.solvd.flightfinder.interfaces;

import com.solvd.flightfinder.entities.Airport;

import java.util.List;
import java.sql.SQLException;

public interface AirportMapper extends IEntityMapper<Airport> {

    List<Airport> getByCity(long city_id) throws SQLException;
}
