package com.solvd.flightfinder.ui.mainmenu;

import com.solvd.flightfinder.ui.AbstractMenuEnum;
import com.solvd.flightfinder.ui.countriesmenu.CountriesMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainMenu extends AbstractMenuEnum<MainMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(MainMenu.class);
    //private final User user;

    public MainMenu(/*User user*/) {
        //this.user = user;
        LOGGER.info("Printing Main Menu");
        MainMenuEnum option = changeOption(MainMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(MainMenuEnum result) {
        switch (result) {
            case CHECK_FLIGHTS:
                new CountriesMenu(/*pass user*/);
                break;
            case PURCHASE:
                //TODO implement purchase.
                //new PurchaseMenu(user);
                break;
            case EXIT:
                break;
        }
    }
}
