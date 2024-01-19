package com.qsp.flight.driver;

import java.util.List;
import java.util.Scanner;

import com.qsp.dao.CustomerDao;
import com.qsp.dao.TripDao;
import com.qsp.dao.implementation.CustomerDaoImplementation;
import com.qsp.dao.implementation.TripDaoImplementation;
import com.qsp.model.Customer;
import com.qsp.model.Trip;

public class SignIn {

	public static void main(String[] args) {

		CustomerDao dao = new CustomerDaoImplementation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email : ");
		String email = sc.next();
		System.out.println("Enter the Password : ");
		String password = sc.next();
		Customer customer = dao.login(email, password);

		if (customer != null) {
			System.out.println("Welcome " + customer.getUserName());

			System.out.println("Enter the Starting Point : ");
			String start = sc.next();
			System.out.println("Enter the Ending Point : ");
			String end = sc.next();

			TripDao dao1 = new TripDaoImplementation();
			List<Trip> trip = dao1.findByStartAndEnd(start, end);

			if (trip != null) {
				int i = 1;
				System.out.println("option\t" + "tripfrom\t" + "tripto\t" + "date\t" + "starttime\t" + "endtime\t" + "price");
				for (Trip trips : trip) {
					System.out.println(
							i++ + "\t" + trips.getTripFrom() + "\t" + trips.getTripTo() + "\t" + trips.getDate() + "\t"
									+ trips.getStartTime() + "\t" + trips.getEndTime() + "\t" + trips.getPrice());
				}
				System.out.println("Enter the choice : ");
				int choice = sc.nextInt();
				if (choice <= i && choice >= 1) {
					Trip selectedTrip = trip.get(choice - 1);
				}

			}

		} else {
			System.out.println("No user found...");
		}
	}
}
