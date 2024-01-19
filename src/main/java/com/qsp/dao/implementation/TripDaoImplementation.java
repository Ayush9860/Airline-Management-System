package com.qsp.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.qsp.dao.TripDao;
import com.qsp.model.Flight;
import com.qsp.model.Trip;

public class TripDaoImplementation implements TripDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("java");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public Trip saveTrip(Trip trip) {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(trip);
		entityTransaction.commit();
		return null;
	}

	@Override
	public Trip updateTripById(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteTripById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Trip findTripById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trip findAllTrip() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trip> findByStartAndEnd(String start, String end) {

		Query query = entityManager.createQuery("select t from Trip t where t.tripFrom=?1 and t.tripTo=?2");
		query.setParameter(1,start);
		query.setParameter(2,end);
		return query.getResultList();
	}

}
