package com.qsp.flight.driver;

import com.qsp.dao.CustomerDao;
import com.qsp.dao.implementation.CustomerDaoImplementation;
import com.qsp.model.Customer;

public class CustomerDriver {

	public static void main(String[] args) {
		
		CustomerDao dao = new CustomerDaoImplementation();
		
		Customer customer = new Customer();
		customer.setUserName("Ayush");
		customer.setEmail("ayush123@gmail.com");
		customer.setPassword("Pass@123");
		customer.setPhone(9588679476L);
		
		CustomerDao dao2 = new CustomerDaoImplementation();
		dao2.saveFlight(customer);
		
	}
}
