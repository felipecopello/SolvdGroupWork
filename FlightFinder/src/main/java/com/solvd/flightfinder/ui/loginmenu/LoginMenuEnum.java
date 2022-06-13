package com.solvd.flightfinder.ui.loginmenu;

public enum LoginMenuEnum {
    LOGIN("Login"),
    SIGN_UP("Create an account"),
    EXIT("Exit");

    private final String value;

    LoginMenuEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
