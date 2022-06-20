package com.solvd.flightfinder.ui.finalmenu;

import com.solvd.flightfinder.entities.Flight;
import com.solvd.flightfinder.entities.FlightWithConnection;
import com.solvd.flightfinder.entities.Passenger;
import com.solvd.flightfinder.interfaces.FlightMapper;
import com.solvd.flightfinder.ui.AbstractMenuEnum;
import com.solvd.flightfinder.utils.FilterUtil;
import com.solvd.flightfinder.utils.FlightSelector;
import com.solvd.flightfinder.utils.GeoDistanceCalculator;
import com.solvd.flightfinder.utils.MyBatisFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FinalMenu extends AbstractMenuEnum<FinalMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(FinalMenu.class);
    private final Passenger passenger;
    FlightMapper flightMapper = (FlightMapper) MyBatisFactory.getMyBatis("flight");
    int flightCounter = 0;
    DecimalFormat df = new DecimalFormat("#.##");

    List<Flight> directFlights = new ArrayList<>();
    List<Flight> flightsJoin = new ArrayList<>();
    List<FlightWithConnection> flightsWithConnections = new ArrayList<>();

    public FinalMenu(Passenger passenger) {
        this.passenger = passenger;
        List<Flight> flightsByDepartureId = flightMapper.getByDepartureAirportId(passenger.getOrigin());
        List<Flight> flightsByArrivalId = flightMapper.getByArrivalAirportId(passenger.getDestination());
        directFlights = FlightSelector.getDirectFlights(flightsByDepartureId, passenger.getDestination());
        flightsWithConnections = FlightSelector.compareFlights(flightsByDepartureId, flightsByArrivalId, passenger.getDestination());
        LOGGER.info("Direct Flight options:");
        directFlights.forEach(f -> LOGGER.info("flight: " + f.getFlightId() + " from: " +
                f.getDepartureAirport().getCityLocation().getName() + " to: " +
                f.getArrivalAirport().getCityLocation().getName() + " city.\n"));
        LOGGER.info("Connection Flight options:");
        flightsWithConnections.forEach(
                fwc -> LOGGER.info("option: " + ++flightCounter + " => flight: " + fwc.getDepartureFlight().getFlightId() + " from: " +
                        fwc.getDepartureFlight().getDepartureAirport().getCityLocation().getName() + " city to: " +
                        fwc.getDepartureFlight().getArrivalAirport().getCityLocation().getName() + " city. \n" +
                        "and flight : " + fwc.getArrivalFlight().getFlightId() + " from: " +
                        fwc.getArrivalFlight().getDepartureAirport().getCityLocation().getName() + " city to: "
                        + fwc.getArrivalFlight().getArrivalAirport().getCityLocation().getName() + " city. \n")
        );
        FinalMenuEnum option = changeOption(FinalMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(FinalMenuEnum result) {
        switch (result) {
            case SHOW_SHORTEST:
                if (directFlights.isEmpty()) {
                    FilterUtil.getShortestBigFlight(FilterUtil.joinFlights(flightsWithConnections));
                } else {
                    LOGGER.info("The shortest options are the direct flight: ");
                    directFlights.forEach(f -> LOGGER.info("flight: " + f.getFlightId() + " with a distance of " +
                            df.format(GeoDistanceCalculator.distanceFromAirport(f.getDepartureAirport(), f.getArrivalAirport())) + " km."));
                }
                break;
            case SHOW_CHEAPEST:
                flightsWithConnections.forEach(
                        fwc -> fwc.setPrice(fwc.getDepartureFlight().getPrice() + fwc.getArrivalFlight().getPrice())
                );
                FilterUtil.selectPrice(flightsWithConnections, directFlights);
                break;
            case EXIT:
                break;
        }
    }
}
