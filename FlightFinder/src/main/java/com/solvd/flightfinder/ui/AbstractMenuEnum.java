package com.solvd.flightfinder.ui;

import com.solvd.flightfinder.interfaces.IShowDate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Date;

public abstract class AbstractMenuEnum<T extends Enum<T>> extends AbstractMenu<T> {
    private static final Logger LOGGER = LogManager.getLogger(AbstractMenuEnum.class);

    public void printAllElements(Class<T> options) {

        IShowDate stringDate = Date::toString;

        LOGGER.info("Clock: " + stringDate.showDate(clock));
        LOGGER.info("Giving all elements options");
        Arrays.stream(options.getEnumConstants()).forEach(option ->
                LOGGER.info(option.ordinal() + "- " + option + "."));
    }
}
