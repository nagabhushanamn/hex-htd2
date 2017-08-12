package com.app.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Product;

/*
 *  in hibernate , we can select data in 4 ways
 *  
 *  --> by primary key  ( session.get() | session.load() )
 *  --> by HQL ( Hibernate Query Lang )
 *  --> by criteria API ( for dynamic/complex queries )
 *  --> Native SQL
 * 
 * 
 */

public class Select {

	public static void main(String[] args) {

		// Hibernate API

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Product product = session.get(Product.class, 2); // persistent
		System.out.println(product);

		product.setPrice(250.00);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
