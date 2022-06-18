package com.solvd.flightfinder.ui.travelmenu;

import com.solvd.flightfinder.entities.Passenger;
import com.solvd.flightfinder.ui.AbstractMenuEnum;
import com.solvd.flightfinder.ui.airportselection.AirportSelection;
import com.solvd.flightfinder.ui.mainmenu.MainMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class TravelMenu extends AbstractMenuEnum<TravelMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(MainMenu.class);
    private final Passenger passenger;
    AirportSelection id = new AirportSelection();

    public TravelMenu(Passenger passenger) throws SQLException {
        this.passenger = passenger;
        TravelMenuEnum option = changeOption(TravelMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(TravelMenuEnum result) throws SQLException {
        switch (result) {
            case SET_ORIGIN:
                passenger.setOrigin(id.AirportSelection());
                new TravelMenu(passenger);
                break;
            case SET_DESTINATION:
                passenger.setDestination(id.AirportSelection());
                new TravelMenu(passenger);
                break;
            case G0_BACK:
                new MainMenu(passenger);
                break;
            case EXIT:
                break;
        }
    }
}
