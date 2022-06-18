package com.solvd.flightfinder;

import com.solvd.flightfinder.entities.City;
import com.solvd.flightfinder.interfaces.*;
import com.solvd.flightfinder.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class MyBatisUtil {
    private static final Logger LOGGER = LogManager.getLogger(Runner.class);
    private static SqlSessionFactory factory = SqlSessionFactoryUtil.getInstance();
    private static SqlSession session = factory.openSession();

    public static void main(String[] args) {
        LOGGER.info("------Welcome to flight finder------");

        // Prueba del primer mapper
        try {
            CountryMapper countryMapper = session.getMapper(CountryMapper.class);
            CityMapper cityMapper = session.getMapper(CityMapper.class);
            AirportMapper airportMapper = session.getMapper(AirportMapper.class);
            PassengerMapper passengerMapper = session.getMapper(PassengerMapper.class);
            AirlineMapper airlineMapper = session.getMapper(AirlineMapper.class);
//			Country uruguay = new Country("Uruguay");
//			countryMapper.save(uruguay);
            LOGGER.info(countryMapper.getById(2));
//			countryMapper.delete(uruguay);
            List<City> ciudades = cityMapper.getAll();
            ciudades.forEach((c) -> LOGGER.info(c));
            LOGGER.info(airportMapper.getById(1));
            LOGGER.info(passengerMapper.getById(2));
            LOGGER.info(airlineMapper.getAll());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
