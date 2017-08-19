package com.example.demo.service;

public class AccountUpdateException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Account update failed";
	}

}
