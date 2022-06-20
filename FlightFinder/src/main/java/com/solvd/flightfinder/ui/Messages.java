package com.solvd.flightfinder.ui;

import com.solvd.flightfinder.ui.airportselection.AirportSelection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Messages {
    private final static Logger LOGGER = LogManager.getLogger(AirportSelection.class);

    public static void welcomeMessage() {
        LOGGER.info("------Welcome to flight finder------");
    }

    public static void logo() {
        LOGGER.info("""
                    _________       __    __     _______           __        \s
                   / ____/ (_)___ _/ /_  / /_   / ____(_)___  ____/ /__  _____
                  / /_  / / / __ `/ __ \\/ __/  / /_  / / __ \\/ __  / _ \\/ ___/
                 / __/ / / / /_/ / / / / /_   / __/ / / / / / /_/ /  __/ /   \s
                /_/   /_/_/\\__, /_/ /_/\\__/  /_/   /_/_/ /_/\\__,_/\\___/_/    \s
                          /____/                                             \s
                """);
    }
}