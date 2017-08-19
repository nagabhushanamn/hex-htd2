package com;

public class Q5 {

	public static void main(String[] args) {

	}

	void m(int param) {
		new Thread(new Runnable() {
			public void run() {
				System.err.println(param);
			}
		}).start();
	}

}
