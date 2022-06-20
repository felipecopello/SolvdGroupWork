package com.solvd.flightfinder.interfaces;

public interface IUi<T> {
    T changeOption(Class<T> options);

    T manageOptions(Class<T> options);
}