package com.qsp.flight;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	private int custId;
	private String custName;
	private String email;
	private long phone;
	private String password;
	@OneToMany
	private List<Ticket> ticket;

	public int getUserId() {
		return custId;
	}

	public void setUserId(int userId) {
		this.custId = userId;
	}

	public String getUserName() {
		return custName;
	}

	public void setUserName(String userName) {
		this.custName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}

}
