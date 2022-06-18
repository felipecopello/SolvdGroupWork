package com.solvd.flightfinder.entities;

public class Passenger {
    private long id;
    private String name;
    private int age;
    private long origin;
    private long destination;

    public Passenger() {
    }

    public Passenger(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Passenger(long id, String name, int age, long origin, long destination) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.origin = origin;
        this.destination = destination;
    }

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public long getPassengerId() {
        return id;
    }

    public void setPassengerId(long id) {
        this.id = id;
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

    public long getOrigin() {
        return origin;
    }

    public void setOrigin(long origin) {
        this.origin = origin;
    }

    public long getDestination() {
        return destination;
    }

    public void setDestination(long destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Passenger [ passengerId=" + id + ", name='" + name + ", age=" + age + ", origin=" + origin +
                ", destination=" + destination + ']';
    }
}
