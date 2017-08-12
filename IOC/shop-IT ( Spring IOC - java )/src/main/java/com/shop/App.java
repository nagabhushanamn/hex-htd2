package com.shop;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// Init

		ConfigurableApplicationContext ac = null;
		ac = new AnnotationConfigApplicationContext(ShopConfig.class);

		// Use
		Billing billing = ac.getBean("billComp", Billing.class);
		List<String> cart = Arrays.asList("32456", "9876543");
		double totalPrice = billing.getTotalPrice(cart);
		System.out.println("total-" + totalPrice);
		System.out.println("Happy shopping");

		// Destroy
		ac.close();

	}

}
