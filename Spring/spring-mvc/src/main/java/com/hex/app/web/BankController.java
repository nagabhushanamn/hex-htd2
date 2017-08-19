package com.hex.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class BankController {

	// customers/custID/accounts/accNum/txns

	@RequestMapping(value = "/customers/{custId}/accounts/{accNum}/txns")
	public String getTxns(@PathVariable("custId") String custId, @PathVariable String accNum) {
		System.out.println(custId);
		System.out.println(accNum);
		return "No Txns";
	}

}
