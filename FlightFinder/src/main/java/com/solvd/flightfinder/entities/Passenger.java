package com.solvd.flightfinder.entities;

public class Passenger {
    private int passengerId;
    private String name;
    private int age;
    private Airport origin;
    private Airport destination;

    public Passenger() {
    }

    public Passenger(int passengerId, String name, int age) {
        this.passengerId = passengerId;
        this.name = name;
        this.age = age;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Airport getOrigin() {
        return origin;
    }

    public void setOrigin(Airport origin) {
        this.origin = origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Passenger [ passengerId=" + passengerId + ", name='" + name + ", age=" + age + ", origin=" + origin +
                ", destination=" + destination + ']';
    }
}
