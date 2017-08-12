package com.shop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

@Configuration
// @ComponentScan(basePackages = { "com.shop" })
public class ShopConfig {

	@Bean
	public PriceMatrix pmV1() {
		return new PriceMatrixImpl_v1();
	}

	@Bean
	public PriceMatrix pmV2() {
		return new PriceMatrixImpl_v2();
	}

	@Bean
	public Billing billComp() {
		Billing billing = new BillingImpl(pmV1());
		return billing;
	}

}
