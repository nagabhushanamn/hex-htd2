package com.app.crud;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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

public class JPQL {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PMUnit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		// -----------------------------------------------------

		// String price = "400";
		//
		// String jpql = "from Product p where p.price < :prodPrice";
		// Query query = em.createQuery(jpql);
		// query.setParameter("prodPrice", Double.parseDouble(price));
		//
		// // Pagination
		// // query.setFirstResult(3);
		// // query.setMaxResults(2);
		//
		// List<Product> list = query.getResultList();
		// for (Product product : list) {
		// System.out.println(product);
		// }

		// -----------------------------------------------------

		// String jpql = "select p.name,p.price from Product p";
		// Query query = em.createQuery(jpql);
		// List<Object[]> list = query.getResultList();
		//
		// for (Object[] oa : list) {
		// System.out.println(oa[0] + "\t" + oa[1]);
		// }

		// -----------------------------------------------------

		// String jpql = "select new com.app.crud.ProductDet(p.name,p.price) from
		// Product p";
		// Query query = em.createQuery(jpql);
		// List<ProductDet> list = query.getResultList();
		//
		// for (ProductDet det : list) {
		// System.out.println(det);
		// }

		// -----------------------------------------------------

		// String jpql = "select new list(p.name,p.price) from Product p";
		// Query query = em.createQuery(jpql);
		// List<List> list = query.getResultList();
		//
		// for (List l : list) {
		// System.out.println(l);
		// }

		// String jpql = "select new map(p.name,p.price) from Product p";
		// Query query = em.createQuery(jpql);
		// List<Map> list = query.getResultList();
		//
		// for (Map m : list) {
		// System.out.println(m);
		// }

		// -----------------------------------------------------

		// String jpql = "from Product p where p.company is not null";
		String jpql = "from Product p where p.company.name='Abc Pvt Ltd'";
		Query query = em.createQuery(jpql);
		List<Product> list = query.getResultList();
		for (Product product : list) {
			System.out.println(product);
		}

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
