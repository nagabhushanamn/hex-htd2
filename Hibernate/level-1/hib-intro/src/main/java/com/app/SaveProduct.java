package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Product;

public class SaveProduct {

	public static void main(String[] args) {

		Product product = new Product();
		product.setId(2345678);
		product.setName("New Item");

		// Hibernate API

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		session.save(product);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
