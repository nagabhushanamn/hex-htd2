package com.app;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;
import com.app.model.EmployeeID;
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

		EmployeeID employeeID = new EmployeeID();
		employeeID.setEmpID(123);
		employeeID.setDepID("DEP-01");

		employee.setEmployeeID(employeeID);
		employee.setName("Nag");

		session.save(employee);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
