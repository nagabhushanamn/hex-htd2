package com.app.crud;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import com.app.model.Product;

/*
 * 
 * 
 *  Limitation SQL
 *  ---------------
 *  
 *   --> will not support OO
 *   --> depends on DBMS product
 *   
 *   
 *  Advantages of HQL/JPQL
 *  ------------------------
 *  
 *   --> OO based
 *   --> portable on DBMS
 * 
 */

public class Criteria_API {

	public static void main(String[] args) {

		// Hibernate API

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Criteria criteria = session.createCriteria(Product.class);
		// criteria.add(Restrictions.like("name", "lapt%"));

		Product exProduct = new Product();
		exProduct.setName("item-7");
		exProduct.setPrice(500.00);

		criteria.add(Example.create(exProduct));

		List<Product> products = criteria.list();

		for (Product product : products) {
			System.out.println(product);
		}

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
