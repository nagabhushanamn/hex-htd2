package com;

public class Ex4 {

	public static void main(String[] args) {
		new Ex4().m();
	}

	public void m() {
		String message = "Hello";
		// message = "Hi";

		Runnable runnable = () -> {
			System.out.println(this);
			System.out.println(message + " im running...");
		};

		Thread thread = new Thread(runnable);
		thread.start();
	}

}
