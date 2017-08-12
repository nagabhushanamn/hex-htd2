package com.app.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.app.model.Product;

public class Insert {

	public static void main(String[] args) {

		Product product = new Product(); // Transient
		product.setId(5);
		product.setName("Item-5");
		product.setPrice(500.00);

		// JPA

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PMUnit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.persist(product);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
