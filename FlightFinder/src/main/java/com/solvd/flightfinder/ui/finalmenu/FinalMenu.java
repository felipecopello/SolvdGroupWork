package com.solvd.flightfinder.ui.finalmenu;

import com.solvd.flightfinder.ui.AbstractMenuEnum;
import com.solvd.flightfinder.ui.mainmenu.MainMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinalMenu extends AbstractMenuEnum<FinalMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(MainMenu.class);
    //private final User user;

    public FinalMenu(/*user*/) {
        //this.user = user;
        FinalMenuEnum option = changeOption(FinalMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(FinalMenuEnum result) {
        switch (result) {
            case SHOW_SHORTEST:
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
