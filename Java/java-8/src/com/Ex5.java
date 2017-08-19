package com;

public class Ex5 {

	public static void main(String[] args) {

		// StringToIntMapper mapper = s -> s.length();
		StringToIntMapper mapper = String::length;  // Method reference

		System.out.println(mapper.map("hello"));

	}

}
