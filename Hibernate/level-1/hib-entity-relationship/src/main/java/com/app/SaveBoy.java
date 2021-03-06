package com.app;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Boy;
import com.app.model.Girl;

public class SaveBoy {

	public static void main(String[] args) {

		// Hibernate API

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Boy boy = new Boy();
		boy.setId(11);
		boy.setName("Nag");

		Girl girl = new Girl();
		girl.setId(22);
		girl.setName("Indu");

		boy.setGirl(girl);

		// session.save(girl);
		session.save(boy);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
