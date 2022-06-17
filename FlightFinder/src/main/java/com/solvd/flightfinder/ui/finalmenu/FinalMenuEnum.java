package com.solvd.flightfinder.ui.finalmenu;

public enum FinalMenuEnum {
    SHOW_SHORTEST("Show shortest fly"),
    SHOW_CHEAPEST("Show cheapest fly"),
    EXIT("Exit");

    private final String value;

    FinalMenuEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }

}
