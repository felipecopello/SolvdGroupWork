package com.solvd.flightfinder;

import com.solvd.flightfinder.entities.utils.GeoDistanceCalculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

	//keith comment
	private static final Logger LOGGER = LogManager.getLogger(Runner.class);

	public static void main(String[] args) {
		LOGGER.info("------Welcome to flight finder------");
		//util testing Rosario - Sidney
		LOGGER.info(GeoDistanceCalculator.distance(-32.90, -60.79, -33.95, 151.18));
	}
}
