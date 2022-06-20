package com.solvd.flightfinder.utils;

import com.solvd.flightfinder.entities.Airport;

public class GeoDistanceCalculator {

    public static double distance(double lat1, double lon1, double lat2, double lon2) {
        if ((lat1 == lat2) && (lon1 == lon2)) {
            return 0;
        } else {
            double theta = lon1 - lon2;
            double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
            dist = Math.acos(dist);
            dist = Math.toDegrees(dist);
            dist = dist * 60 * 1.1515;
            dist = dist * 1.609344;
            return (dist);
        }
    }

    public static double distanceFromAirport(Airport origin, Airport destination){
        double originLatitude = origin.getLatitude();
        double originLongitude = origin.getLongitude();
        double destinationLatitude = destination.getLatitude();
        double destinationLongitude = origin.getLongitude();
        return(distance(originLatitude,originLongitude,destinationLatitude,destinationLongitude));
    }
}
