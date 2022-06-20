package com.solvd.flightfinder.ui.travelmenu;

public enum TravelMenuEnum {
    SET_ORIGIN("Set Origin."),
    SET_DESTINATION("Set Destination."),
    G0_BACK("Go to the Main Menu."),
    EXIT("Exit");

    private final String value;

    TravelMenuEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
