package com.solvd.flightfinder.ui.interfaces;

@FunctionalInterface
public interface IRegexCompare {
    boolean validateInput(String patter, String input);
}
