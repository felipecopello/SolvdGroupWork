package com.solvd.flightfinder.ui.countriesmenu;

public enum CountriesMenuEnum {
    ARGENTINA("Argentina"),
    USA("USA"),
    BELARUS("Belarus");

    private final String value;

    CountriesMenuEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
