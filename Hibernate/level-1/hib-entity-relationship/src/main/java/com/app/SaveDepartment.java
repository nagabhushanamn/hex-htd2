package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Boy;
import com.app.model.Department;
import com.app.model.Employee;
import com.app.model.Girl;

public class SaveDepartment {

	public static void main(String[] args) {

		// Hibernate API

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("A");

		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("B");

		Department department = new Department();
		department.setId(111);
		department.setName("IT");
		department.getEmployees().add(employee);
		department.getEmployees().add(employee2);

		employee.setDepartment(department);
		employee2.setDepartment(department);

		session.save(department);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
