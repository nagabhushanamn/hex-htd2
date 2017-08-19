package com.component;

import com.anno.RequestMapping;

public class ComponentA {

	@RequestMapping(url = "/login", method = "POST")
	public void doLogin() {
		System.out.println("Login..");
	}

	@RequestMapping(url = "/register", method = "POST")
	public void doRegister() {
		System.out.println("Register.....");
	}

}
