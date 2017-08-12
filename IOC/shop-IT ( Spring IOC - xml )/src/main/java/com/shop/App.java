package com.shop;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// Init

		// PriceMatrix pmV1 = new PriceMatrixImpl_v1();
		// PriceMatrix pmV2 = new PriceMatrixImpl_v2();
		// Billing billing = new BillingImpl(pmV2);

		ConfigurableApplicationContext ac = null;
		ac = new ClassPathXmlApplicationContext("shop-app.xml");

		// Use
		Billing billing = ac.getBean("billComp2", Billing.class);
		List<String> cart = Arrays.asList("32456", "9876543");
		double totalPrice = billing.getTotalPrice(cart);
		System.out.println("total-" + totalPrice);
		System.out.println("Happy shopping");

		// Destroy
		ac.close();

	}

}
