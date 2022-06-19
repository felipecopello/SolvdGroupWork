package com.solvd.flightfinder;

import com.solvd.flightfinder.entities.Passenger;
import com.solvd.flightfinder.utils.JacksonUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JacksonTrialRunner {
    private static final Logger LOGGER = LogManager.getLogger(JacksonTrialRunner.class);

    public static void main(String[] arg) {

        Passenger passenger = new Passenger();
        passenger.setPassengerId(1111);
        passenger.setAge(27);
        passenger.setName("Carlos");

        JacksonUtil.writePassenger(passenger);
    }
}
