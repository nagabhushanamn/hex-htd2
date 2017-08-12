package com.shop;

import java.util.Arrays;
import java.util.List;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// Init
		BillingImpl billing = new BillingImpl();

		// Use
		List<String> cart = Arrays.asList("32456", "9876543");
		double totalPrice = billing.getTotalPrice(cart);
		System.out.println("total-" + totalPrice);
		System.out.println("Happy shopping");

		// Destroy
		// ...

	}

}
