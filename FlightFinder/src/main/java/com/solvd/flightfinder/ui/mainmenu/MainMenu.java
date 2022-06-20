package com.solvd.flightfinder.ui.mainmenu;

import com.solvd.flightfinder.entities.Passenger;
import com.solvd.flightfinder.ui.AbstractMenuEnum;
import com.solvd.flightfinder.ui.finalmenu.FinalMenu;
import com.solvd.flightfinder.ui.travelmenu.TravelMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class MainMenu extends AbstractMenuEnum<MainMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(MainMenu.class);
    private final Passenger passenger;

    public MainMenu(Passenger passenger) throws SQLException {
        this.passenger = passenger;
        MainMenuEnum option = changeOption(MainMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(MainMenuEnum result) throws SQLException {
        switch (result) {
            case CHECK_FLIGHTS:
                new TravelMenu(passenger);
                break;
            case PURCHASE:
                new FinalMenu(passenger);
                break;
            case EXIT:
                break;
        }
    }
}
