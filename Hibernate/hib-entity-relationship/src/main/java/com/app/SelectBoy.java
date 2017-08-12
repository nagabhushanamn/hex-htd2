package com.app;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Boy;

public class SelectBoy {

	public static void main(String[] args) {

		// Hibernate API

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Boy boy = session.get(Boy.class, 11);
		System.out.println(boy.getName());
		System.out.println(boy.getGirl().getName());

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
