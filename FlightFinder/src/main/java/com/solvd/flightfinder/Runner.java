package com.solvd.flightfinder;

import com.solvd.flightfinder.ui.Messages;
import com.solvd.flightfinder.ui.loginmenu.LoginMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class Runner {
    private static final Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void main(String[] args) throws SQLException {
        Messages.logo();
        Messages.welcomeMessage();
        new LoginMenu();
    }
}
