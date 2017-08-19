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

public class NativeSQL {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PMUnit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Query query = em.createNativeQuery("select * from products");

		List<Object> list = query.getResultList();
		for (Object product : list) {
			System.out.println(product);
		}

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
