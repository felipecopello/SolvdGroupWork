package com.solvd.flightfinder.ui.interfaces;

public interface IUi<T>{
    T changeOption(Class<T> options);

    T manageOptions(Class<T> options);
}