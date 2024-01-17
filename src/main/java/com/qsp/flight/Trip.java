package com.qsp.flight;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trip {

	@Id
	private int tripId;
	private String tripFrom;
	private String tripTo;
	private LocalDate date;
	private LocalDateTime startTime;
	private String endTime;
	private double price;
	private Flight flight;

	public int getTripId() {
		return tripId;
	}

	public void setTripId(int tripId) {
		this.tripId = tripId;
	}

	public String getTripFrom() {
		return tripFrom;
	}

	public void setTripFrom(String tripFrom) {
		this.tripFrom = tripFrom;
	}

	public String getTripTo() {
		return tripTo;
	}

	public void setTripTo(String tripTo) {
		this.tripTo = tripTo;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

}
