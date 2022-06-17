package com.solvd.flightfinder.ui.countriesmenu;

import com.solvd.flightfinder.entities.Passenger;
import com.solvd.flightfinder.ui.mainmenu.MainMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CountriesMenu {
    private final static Logger LOGGER = LogManager.getLogger(CountriesMenu.class);
    private final Passenger passenger;

    public CountriesMenu(Passenger passenger) {
        this.passenger = passenger;
        manageCases();
        MainMenu mainMenu = new MainMenu(passenger);
    }

    public void manageCases() {
        //TODO call for countries in the database and print them with a stream.

    }
}
