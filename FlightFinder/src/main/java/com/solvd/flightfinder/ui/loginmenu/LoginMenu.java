package com.solvd.flightfinder.ui.loginmenu;

import com.solvd.flightfinder.entities.Passenger;
import com.solvd.flightfinder.interfaces.PassengerMapper;
import com.solvd.flightfinder.ui.AbstractMenuEnum;
import com.solvd.flightfinder.ui.mainmenu.MainMenu;
import com.solvd.flightfinder.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.Scanner;

public class LoginMenu extends AbstractMenuEnum<LoginMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(LoginMenu.class);
    private static SqlSessionFactory factory = SqlSessionFactoryUtil.getInstance();
    private static SqlSession session = factory.openSession();
    Scanner sc = new Scanner(System.in);
    PassengerMapper passengerMapper = session.getMapper(PassengerMapper.class);

    public LoginMenu() throws SQLException {
        LoginMenuEnum option = changeOption(LoginMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(LoginMenuEnum result) throws SQLException {
        switch (result) {
            case LOGIN:
                Passenger passenger = passengerMapper.getById(2);
                new MainMenu(passenger);
                break;
            case SIGN_UP:
                Sign_up();
                new LoginMenu();
                break;
            case EXIT:
                break;
        }
    }

    private void Sign_up() throws SQLException {
        LOGGER.info("Insert the passenger new id:");
        int id = sc.nextInt();
        LOGGER.info("Insert the passenger name:");
        String name = sc.next();
        LOGGER.info("Insert the passenger age:");
        int age = sc.nextInt();
        passengerMapper.save(new Passenger(id, name, age));
    }
}
