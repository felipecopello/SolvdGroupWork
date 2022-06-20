package com.solvd.flightfinder.interfaces;

import com.solvd.flightfinder.entities.City;

import java.sql.SQLException;
import java.util.List;

public interface CityMapper extends IEntityMapper<City> {

    List<City> getByCountry(long country_id) throws SQLException;
}
