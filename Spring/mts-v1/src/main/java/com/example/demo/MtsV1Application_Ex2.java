package com.example.demo;

import java.sql.Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Isolation;

import com.example.demo.service.TxrService;

@SpringBootApplication
public class MtsV1Application_Ex2 {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = null;
		context = SpringApplication.run(MtsV1Application_Ex2.class, args);
		TxrService txrService = context.getBean(TxrService.class);

		// Thread thread1 = new Thread(() -> {
		//
		// txrService.txr(3000, "1", "2");
		// System.out.println("Txr success");
		//
		// }, "Nag");
		//
		Thread thread2 = new Thread(() -> {

			txrService.txr(3000, "1", "2");
			System.out.println("Txr success");

		}, "Kannan");

		// thread1.start();
		thread2.start();
		
		//-----------------------------------------------
		
	}
}
