package com.app.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.app.model.Company;
import com.app.model.Product;

public class Insert {

	public static void main(String[] args) {

		Product product = new Product(); // Transient
		product.setId(9);
		product.setName("Item-9");
		product.setPrice(900.00);

		// Company company = new Company();
		// company.setId(111);
		// company.setName("Abc Pvt Ltd");

		// product.setCompany(company);
		// company.getProducts().add(product);

		// JPA

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PMUnit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		// em.persist(company);
		// product.setCompany(em.find(Company.class, 111));
		em.persist(product);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
