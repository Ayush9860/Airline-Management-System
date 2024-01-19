package com.qsp.dao;

import java.util.List;

import com.qsp.model.Customer;
import com.qsp.model.Trip;

public interface CustomerDao {

	public Customer saveFlight(Customer customer);

	public Customer updateCustomerById(int id, String name);

	public boolean deleteCustomerById(int id);

	public Customer findCustomerById(int id);

	public Customer findAllCustomer();

	public Customer login(String email, String password);

}
