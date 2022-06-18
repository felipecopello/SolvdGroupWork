package com.solvd.flightfinder.ui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public abstract class AbstractMenuEnum<T extends Enum<T>> extends AbstractMenu<T> {
    private static final Logger LOGGER = LogManager.getLogger(AbstractMenuEnum.class);

    public void printAllElements(Class<T> options) {
        Arrays.stream(options.getEnumConstants()).forEach(option ->
                LOGGER.info(option.ordinal() + "- " + option + "."));
    }
}
