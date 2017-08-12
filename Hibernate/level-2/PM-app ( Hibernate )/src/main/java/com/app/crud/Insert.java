package com.app.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Product;

public class Insert {

	public static void main(String[] args) {

		Product product = new Product(); // Transient
		product.setId(4);
		product.setName("Item-4");
		product.setPrice(400.00);

		// Hibernate API

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		session.save(product); // Persistent
		product.setPrice(400.00);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
