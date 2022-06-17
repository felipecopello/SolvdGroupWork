package com.solvd.flightfinder.interfaces;

@FunctionalInterface
public interface IRegexCompare {
    boolean validateInput(String patter, String input);
}
