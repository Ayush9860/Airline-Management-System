package com.qsp.dao;

import java.util.List;

import com.qsp.model.Trip;

public interface TripDao {

	public Trip saveTrip(Trip trip);

	public Trip updateTripById(int id, String name);

	public boolean deleteTripById(int id);

	public Trip findTripById(int id);

	public Trip findAllTrip();

	public List<Trip> findByStartAndEnd(String start, String end);
}
