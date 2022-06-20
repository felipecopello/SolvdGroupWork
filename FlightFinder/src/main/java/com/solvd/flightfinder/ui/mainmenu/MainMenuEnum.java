package com.solvd.flightfinder.ui.mainmenu;

public enum MainMenuEnum {
    CHECK_FLIGHTS("Check flights."),
    PURCHASE("Purchase flight."),
    EXIT("Exit");

    private final String value;

    MainMenuEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
