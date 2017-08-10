package com.shop.bill;

import java.util.List;

import com.shop.pm.PriceMatrix;

/*
 *  design & performance issues
 *  ---------------------------
 *  
 *  -> dependency tight-coupling 
 *  
 *  	==> Maintenance issues
 *  	
 *  -> too many same dependencies created & destroyed
 *  
 *  	==> memory, slow , ...
 *  
 *  -> unit-testing not possible
 *  
 *     ==> bug fix , .....
 *     
 *     
 *     
 *     reasons for these issues
 *     
 *     --> dependent itself creating its own dependency.
 *     
 *     
 *     soln:
 *     
 *     --> dont create , do lookup
 *     
 *     limitation on lookup:
 *     
 *     -> location tight-coupling
 *     
 *     best-soln:
 *     
 *     --> dont create, dont lookup , get/injected by 'some-one'  ==> IOC
 *     
 *     
 *     how to implement this IOC ?
 *     
 *      --> Dependency Injection
 *      
 *          a. constructor DI
 *          b. setter
 *          c. field
 *          
 *     
 *     
 * 
 */

public class BillingImpl implements Billing {

	private PriceMatrix priceMatrix;

	public BillingImpl(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	/* (non-Javadoc)
	 * @see com.shop.bill.Billing#getTotalPrice(java.util.List)
	 */
	public double getTotalPrice(List<String> cart) {
		double total = 0.0;
		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}
		return total;
	}
	
	

}
