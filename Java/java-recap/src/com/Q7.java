package com;

interface Hex {
}

class Emp {

}

public class Q7 {

	public static void main(String[] args) {

		Emp emp = new Emp();

		if (emp instanceof Hex) {
			System.out.println("learn from me");
		} else {
			System.out.println("sorry");
		}

	}

}
