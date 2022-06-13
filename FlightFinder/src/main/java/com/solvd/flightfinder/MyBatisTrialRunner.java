package com.solvd.flightfinder;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.flightfinder.interfaces.FlightMapper;

import util.SqlSessionFactoryUtil;

public class MyBatisTrialRunner {
	private static final Logger LOGGER = LogManager.getLogger(Runner.class);
	private static SqlSessionFactory factory = SqlSessionFactoryUtil.getInstance();
	private static SqlSession session = factory.openSession();

	public static void main(String[] args) {
		LOGGER.info("------Welcome to flight finder------");

		// Prueba del primer mapper
		try {
//			CountryMapper countryMapper = session.getMapper(CountryMapper.class);
//			CityMapper cityMapper = session.getMapper(CityMapper.class);
//			AirportMapper airportMapper = session.getMapper(AirportMapper.class);
//			PassengerMapper passengerMapper = session.getMapper(PassengerMapper.class);
//			AirlineMapper airlineMapper = session.getMapper(AirlineMapper.class);
			FlightMapper flightMapper = session.getMapper(FlightMapper.class);
////			Country uruguay = new Country("Uruguay");
////			countryMapper.save(uruguay);
//			LOGGER.info(countryMapper.getById(2));
////			countryMapper.delete(uruguay);
//			List<City> ciudades = cityMapper.getAll();
//			ciudades.forEach((c) -> LOGGER.info(c));
//			LOGGER.info(airportMapper.getById(1));
//			LOGGER.info(passengerMapper.getById(2));
//			LOGGER.info(airlineMapper.getAll());
//			LOGGER.info(flightMapper.getById(10009));
//			List<Flight> flights = flightMapper.getAll();
//			flights.forEach((c) -> LOGGER.info(c));
			LOGGER.info(flightMapper.getByDepartureAirportId(5));
			LOGGER.info(flightMapper.getByArrivalAirportId(5));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
