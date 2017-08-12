package com.app.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Product;

/*
 *  in hibernate , we can select data in 4 ways
 *  
 *  --> by primary key  ( session.get() | session.load() )
 *  --> by JPQL ( Hibernate Query Lang )
 *  --> by criteria API ( for dynamic/complex queries )
 *  --> Native SQL
 * 
 * 
 */

public class Select {

	public static void main(String[] args) {

		// Hibernate API
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PMUnit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Product product = em.find(Product.class, 4);
		System.out.println(product);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
