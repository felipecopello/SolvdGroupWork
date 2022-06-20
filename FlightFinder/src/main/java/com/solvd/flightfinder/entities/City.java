package com.solvd.flightfinder.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class City {
    @JsonProperty
    private long cityId;
    @JsonProperty
    private String name;
    @JsonProperty
    private Country locationCountry;

    public City() {
    }

    public City(int id, String name, Country locationCountry) {
        this.cityId = id;
        this.name = name;
        this.setLocationCountry(locationCountry);
    }

    public Country getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(Country locationCountry) {
        this.locationCountry = locationCountry;
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long id) {
        this.cityId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City [id=" + cityId + ", name=" + name + ", locationCountry=" + locationCountry + "]";
    }

}
