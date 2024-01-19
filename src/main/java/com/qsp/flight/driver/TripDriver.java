package com.qsp.flight.driver;

import java.time.LocalDate;
import java.time.LocalTime;

import com.qsp.dao.FlightDao;
import com.qsp.dao.TripDao;
import com.qsp.dao.implementation.FlightDaoImplementation;
import com.qsp.dao.implementation.TripDaoImplementation;
import com.qsp.model.Flight;
import com.qsp.model.Trip;

public class TripDriver {

	public static void main(String[] args) {
		
		TripDao dao = new TripDaoImplementation();
		
		Trip trip = new Trip();
		trip.setTripFrom("Delhi");
		trip.setTripTo("Mumbai");
		trip.setPrice(4500);
		trip.setStartTime(LocalTime.of(12, 0));
		trip.setEndTime(LocalTime.of(14, 30));
		trip.setDate(LocalDate.parse("2024-02-01"));
		
		FlightDao dao2 = new FlightDaoImplementation();
		Flight flight = dao2.findFlightById(151);
		trip.setFlight(flight);
		dao.saveTrip(trip);
	}
}
