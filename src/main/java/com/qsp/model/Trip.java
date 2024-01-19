package com.qsp.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Trip {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trip_id_gen")
	@SequenceGenerator(name = "trip_id_gen", initialValue = 1000, allocationSize = 100)
	private int tripId;
	private String tripFrom;
	private String tripTo;
	private LocalDate date;
	private LocalTime startTime;
	private LocalTime endTime;
	private double price;
	@ManyToOne
	@JoinColumn
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

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
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
