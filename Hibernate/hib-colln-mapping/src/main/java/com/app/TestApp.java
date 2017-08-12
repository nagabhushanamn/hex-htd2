package com.app;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Address;
import com.app.model.Employee;
import com.app.model.Gender;

public class TestApp {

	public static void main(String[] args) {

		// Hibernate API

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Nag");

		Address address = new Address();
		address.setCity("CHN");
		address.setCountry("IN");

		Address homeAddress = new Address();
		homeAddress.setCity("dream city");
		homeAddress.setCountry("home country");

		employee.getAddresses().add(address);
		employee.getAddresses().add(homeAddress);

		session.save(employee);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
