package com.qsp.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.qsp.dao.CustomerDao;
import com.qsp.dao.TripDao;
import com.qsp.model.Customer;
import com.qsp.model.Trip;

public class CustomerDaoImplementation implements CustomerDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("java");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public Customer saveFlight(Customer customer) {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		return null;
	}

	@Override
	public Customer updateCustomerById(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer findCustomerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer login(String email, String password) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select c from Customer c where c.email=: email and c.password=: password");
		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			return (Customer) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}

	}

}
