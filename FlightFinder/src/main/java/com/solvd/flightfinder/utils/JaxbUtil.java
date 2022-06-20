package com.solvd.flightfinder.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.flightfinder.entities.Flight;
import com.solvd.flightfinder.entities.FlightWithConnection;
import com.solvd.flightfinder.entities.Ticket;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class JaxbUtil {

	private static final Logger LOGGER = LogManager.getLogger(JaxbUtil.class);

	public static void marshallFlight(Flight flight, String path) throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(Flight.class);
		Marshaller mar = context.createMarshaller();
		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		mar.marshal(flight, new File(path));
		LOGGER.info("The flight " + flight.getFlightId() + " was succesfully marshalled");
	}

	public static Flight unmarshallFlight(String path) throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(Flight.class);
		return (Flight) context.createUnmarshaller().unmarshal(new FileReader(path));
	}

	public static void marshallTicket(Ticket ticket, String path) throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(Ticket.class);
		Marshaller mar = context.createMarshaller();
		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		mar.marshal(ticket, new File(path));
		LOGGER.info("The ticket " + ticket.getTicketId() + " was succesfully marshalled");
	}

	public static Ticket unmarshallTicket(String path) throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(Ticket.class);
		return (Ticket) context.createUnmarshaller().unmarshal(new FileReader(path));
	}

	public static void marshallFlightWithConnection(FlightWithConnection flightWithConn, String path)
			throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(FlightWithConnection.class);
		Marshaller mar = context.createMarshaller();
		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		mar.marshal(flightWithConn, new File(path));
		LOGGER.info("The flight with connection  was succesfully marshalled");
	}

	public static FlightWithConnection unmarshallFlightWithConnection(String path) throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(FlightWithConnection.class);
		return (FlightWithConnection) context.createUnmarshaller().unmarshal(new FileReader(path));
	}
}
