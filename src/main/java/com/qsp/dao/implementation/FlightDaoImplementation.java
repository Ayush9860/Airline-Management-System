package com.qsp.dao.implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.dao.FlightDao;
import com.qsp.model.Flight;

public class FlightDaoImplementation implements FlightDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("java");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public Flight saveFlight(Flight flight) {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(flight);
		entityTransaction.commit();

		return null;
	}

	@Override
	public Flight updateFlightById(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteFlightById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Flight findFlightById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Flight.class, id);
	}

	@Override
	public Flight findAllFlight() {
		// TODO Auto-generated method stub
		return null;
	}

}
