package com.solvd.flightfinder.utils;

import com.solvd.flightfinder.interfaces.*;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MyBatisFactory {

    private static SqlSessionFactory factory = SqlSessionFactoryUtil.getInstance();
    private static SqlSession session = factory.openSession();

    public static IEntityMapper<?> getMyBatis(String myBatis) {
        myBatis = myBatis.toLowerCase();
        switch (myBatis) {
            case "airline":
                AirlineMapper airlineMapper = session.getMapper(AirlineMapper.class);
                return airlineMapper;
            case "airport":
                AirportMapper airportMapper = session.getMapper(AirportMapper.class);
                return airportMapper;
            case "city":
                CityMapper cityMapper = session.getMapper(CityMapper.class);
                return cityMapper;
            case "country":
                CountryMapper countryMapper = session.getMapper(CountryMapper.class);
                return countryMapper;
            case "flight":
                FlightMapper flightMapper = session.getMapper(FlightMapper.class);
                return flightMapper;
            case "passenger":
                PassengerMapper passengerMapper = session.getMapper(PassengerMapper.class);
                return passengerMapper;
            case "ticket":
                TicketMapper ticketMapper = session.getMapper(TicketMapper.class);
                return ticketMapper;
        }
        return null;
    }

    public static SqlSession getSession() {
        return session;
    }

    public void setSession(SqlSession session) {
        MyBatisFactory.session = session;
    }
}
