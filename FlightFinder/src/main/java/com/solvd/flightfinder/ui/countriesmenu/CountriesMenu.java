package com.solvd.flightfinder.ui.countriesmenu;

import com.solvd.flightfinder.ui.AbstractMenuEnum;
import com.solvd.flightfinder.ui.mainmenu.MainMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CountriesMenu extends AbstractMenuEnum<CountriesMenuEnum>{
    private final static Logger LOGGER = LogManager.getLogger(CountriesMenu.class);
    //private final User user;

    public CountriesMenu(/*User user*/) {
        //this.user = user;
        LOGGER.info("Printing Countries Menu");
        CountriesMenuEnum option = changeOption(CountriesMenuEnum.class);
        manageCases(option);
        MainMenu mainMenu = new MainMenu(/*user*/);
    }

    public void manageCases(CountriesMenuEnum result) {
        //TODO check execution flow
    }
}
