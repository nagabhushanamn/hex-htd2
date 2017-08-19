package com.app.crud;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

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

public class NativeQuery_Ex {

	public static void main(String[] args) {

		// Hibernate API

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		NativeQuery<Product> query = session.createNativeQuery("select * from products");
		query.addEntity(Product.class);

		List<Product> products = query.list();

		for (Product product : products) {
			System.out.println(product);
		}

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
