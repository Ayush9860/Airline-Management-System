package com.qsp.dao;

import com.qsp.model.Flight;

public interface FlightDao {

	public Flight saveFlight(Flight flight);

	public Flight updateFlightById(int id, String name);

	public boolean deleteFlightById(int id);

	public Flight findFlightById(int id);

	public Flight findAllFlight();
}
