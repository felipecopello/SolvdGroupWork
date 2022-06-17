package com.solvd.flightfinder.ui.loginmenu;

import com.solvd.flightfinder.entities.Passenger;
import com.solvd.flightfinder.ui.AbstractMenuEnum;
import com.solvd.flightfinder.ui.mainmenu.MainMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginMenu extends AbstractMenuEnum<LoginMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(LoginMenu.class);

    public LoginMenu() {
        LoginMenuEnum option = changeOption(LoginMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(LoginMenuEnum result) {
        switch (result) {
            case LOGIN:
                Passenger passenger = new Passenger(1,"Carlos", 23);
                new MainMenu(passenger);
                //TODO implement login. check with the boys. select user from the user db? maybe xd.
                break;
            case SIGN_UP:
                //TODO add user to the db.
                break;
            case EXIT:
                break;
        }
    }
}
