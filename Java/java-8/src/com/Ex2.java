package com;

interface Joiner {
	String join(String s1, String s2);
}

interface Adder {
	int add(int n1, int n2);
}

class Util {

	// public void testJoiner(Joiner joiner) {
	// String s1 = "Hello";
	// String s2 = "World";
	// String s = joiner.join(s1, s2);
	// System.out.println(s);
	// }
	//
	// public void testAddder(Adder adder) {
	// int n1 = 12;
	// int n2 = 13;
	// int n = adder.add(n1, n2);
	// System.out.println(n);
	// }

	public void test(Joiner joiner) {
		String s1 = "Hello";
		String s2 = "World";
		String s = joiner.join(s1, s2);
		System.out.println(s);
	}

	public void test(Adder adder) {
		int n1 = 12;
		int n2 = 13;
		int n = adder.add(n1, n2);
		System.out.println(n);
	}

}

public class Ex2 {

	public static void main(String[] args) {

		Util util = new Util();
		// util.testJoiner((a, b) -> a + "\t" + b);
		// util.testJoiner((a, b) -> a + "-" + b);
		//
		// util.testJoiner((a, b) -> a + b);
		// util.testAddder((a, b) -> a + b);

		util.test((String a, String b) -> a + b);
	}

}
