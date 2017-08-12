package com.app;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Department;
import com.app.model.Employee;
import com.app.model.Girl;

public class SelectDep {

	public static void main(String[] args) {

		// Hibernate API

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Department department = session.get(Department.class, 111);
		System.out.println(department.getName());

		System.out.println("---------------------------");

		session.getTransaction().commit();
		session.close();

		List<Employee> employees = department.getEmployees();
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		sessionFactory.close();
	}

}
