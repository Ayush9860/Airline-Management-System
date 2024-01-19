package com.qsp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;
	private String custName;
	@Column(unique = true, nullable = false)
	private String email;
	@Column(unique = true, nullable = false)
	private long phone;
	private String password;
	@OneToMany(mappedBy = "customer")
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
