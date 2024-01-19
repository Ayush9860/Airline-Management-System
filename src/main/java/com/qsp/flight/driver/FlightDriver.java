package com.qsp.flight.driver;

import com.qsp.dao.FlightDao;
import com.qsp.dao.implementation.FlightDaoImplementation;
import com.qsp.model.Flight;

public class FlightDriver {

	public static void main(String[] args) {

		FlightDao dao = new FlightDaoImplementation();

		Flight flight = new Flight();
		flight.setAgencyName("Agent Airways");
		flight.setFlightNo("AGE123");
		flight.setNoOfSeats(170);

		dao.saveFlight(flight);
	}
}
