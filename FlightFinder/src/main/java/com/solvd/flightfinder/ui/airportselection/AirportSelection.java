package com.solvd.flightfinder.ui.airportselection;

import com.solvd.flightfinder.entities.Airport;
import com.solvd.flightfinder.entities.City;
import com.solvd.flightfinder.entities.Country;
import com.solvd.flightfinder.entities.Passenger;
import com.solvd.flightfinder.interfaces.AirportMapper;
import com.solvd.flightfinder.interfaces.CityMapper;
import com.solvd.flightfinder.interfaces.CountryMapper;
import com.solvd.flightfinder.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportSelection {
    private final static Logger LOGGER = LogManager.getLogger(AirportSelection.class);
    Scanner sc = new Scanner(System.in);
    private static SqlSessionFactory factory = SqlSessionFactoryUtil.getInstance();
    private static SqlSession session = factory.openSession();
    private long country_id;
    private long city_id;
    CountryMapper countryMapper = session.getMapper(CountryMapper.class);
    CityMapper cityMapper = session.getMapper(CityMapper.class);
    AirportMapper airportMapper = session.getMapper(AirportMapper.class);
    private List<Country> countriesList = new ArrayList<>();
    private List<City> citiesList = new ArrayList<>();
    private List<Airport> airportsList = new ArrayList<>();


    public long AirportSelection() throws SQLException {
        countriesList = countryMapper.getAll();
        PrintCountryFromDB();
        country_id = sc.nextLong();
        citiesList = cityMapper.getByCountry(country_id);
        PrintCityFromDB();
        city_id = sc.nextLong();
        airportsList = airportMapper.getByCity(city_id);
        PrintAirportFromBD();
        return(sc.nextLong());
    }

    private void PrintCountryFromDB() throws SQLException {
        countriesList.stream().forEach(c -> LOGGER.info((int) c.getCountryId() + " - " + c.getName() + "."));
    }

    private void PrintCityFromDB() throws SQLException {
        citiesList.stream().forEach(city -> LOGGER.info((int) city.getCityId() + " - " + city.getName() + "."));
    }

    private  void PrintAirportFromBD() throws SQLException{
        airportsList.stream().forEach(airport -> LOGGER.info((int) airport.getAirportId() + " - " + airport.getName() + "."));
    }
}
