package com.solvd.flightfinder.ui.loginmenu;

import com.solvd.flightfinder.ui.AbstractMenuEnum;
import com.solvd.flightfinder.ui.mainmenu.MainMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginMenu extends AbstractMenuEnum<LoginMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(LoginMenu.class);

    public LoginMenu() {
        LOGGER.info("Printing Login Menu");
        LoginMenuEnum option = changeOption(LoginMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(LoginMenuEnum result) {
        switch (result) {
            case LOGIN:

                new MainMenu(/*pass user*/);
                //TODO implement login.
                break;
            case SIGN_UP:
                //TODO user functionality/delete this option/add another.
                break;
            case EXIT:
                break;
        }
    }
}
