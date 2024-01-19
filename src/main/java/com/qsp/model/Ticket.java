package com.qsp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_id_gen")
	@SequenceGenerator(name = "ticket_id_gen", initialValue = 1000, allocationSize = 100)
	private int ticketId;
	@OneToOne
	private Flight flight;
	@ManyToOne
	private Customer customer;
	@OneToOne
	private Trip trip;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

}
