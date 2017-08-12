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

public class Update {

	public static void main(String[] args) {

		// Hibernate API

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// Req-1
		// --------------------------------------------

		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		Product product = session.get(Product.class, 4);
		session.getTransaction().commit();
		session.close(); // Detached
		// session.clear();
		// session.evict(product);

		// -------------------------------------------------

		System.out.println("-----------------------------");
		product.setPrice(475);
		System.out.println("-----------------------------");

		// Req-1
		// --------------------------------------------
		session = sessionFactory.openSession();
		session.getTransaction().begin();
		// session.update(product); // Persistent
		session.merge(product); // Persistent
		session.getTransaction().commit();
		session.close(); // Detached
		// -------------------------------------------------

		sessionFactory.close();

	}

}
