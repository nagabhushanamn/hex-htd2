package com.shop.pm;

import org.springframework.stereotype.Component;

@Component("pmV2")
public class PriceMatrixImpl_v2 implements PriceMatrix {

	public double getPrice(String item) {
		// ..
		return 200.00;
	}

}
