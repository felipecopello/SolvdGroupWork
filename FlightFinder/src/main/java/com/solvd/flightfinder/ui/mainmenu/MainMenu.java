package com.solvd.flightfinder.ui.mainmenu;

import com.solvd.flightfinder.entities.Passenger;
import com.solvd.flightfinder.ui.AbstractMenuEnum;
import com.solvd.flightfinder.ui.countriesmenu.CountriesMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainMenu extends AbstractMenuEnum<MainMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(MainMenu.class);
    private final Passenger passenger;

    public MainMenu(Passenger passenger) {
        this.passenger = passenger;
        MainMenuEnum option = changeOption(MainMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(MainMenuEnum result) {
        switch (result) {
            case CHECK_FLIGHTS:
                new CountriesMenu(passenger);
                break;
            case PURCHASE:
                //todo show the final travel
                break;
            case EXIT:
                break;
        }
    }
}
