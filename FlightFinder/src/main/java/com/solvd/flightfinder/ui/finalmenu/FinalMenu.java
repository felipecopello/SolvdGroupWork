package com.solvd.flightfinder.ui.finalmenu;

import com.solvd.flightfinder.entities.Flight;
import com.solvd.flightfinder.entities.Passenger;
import com.solvd.flightfinder.ui.AbstractMenuEnum;
import com.solvd.flightfinder.ui.mainmenu.MainMenu;
import com.solvd.flightfinder.utils.FlightSelector;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class FinalMenu extends AbstractMenuEnum<FinalMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(MainMenu.class);
    private final Passenger passenger;
    List<List> flights = new ArrayList<>();

    public FinalMenu(Passenger passenger) {
        this.passenger = passenger;
        FlightSelector.flightOptions(passenger.getOrigin(), passenger.getDestination());
        FinalMenuEnum option = changeOption(FinalMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(FinalMenuEnum result) {
        switch (result) {
            case SHOW_SHORTEST:
                LOGGER.info(passenger.toString());
                //todo logic to print shortest.
                break;
            case SHOW_CHEAPEST:
                //todo logic to print cheapest.
                break;
            case EXIT:
                break;
        }
    }
}
