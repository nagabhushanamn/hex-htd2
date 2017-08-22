package com;

class Person {

	private String name;
	private int age;
	private String address;

	{
		System.out.println("Intance block");
	}

	public Person(String name) {
		// this.name = name;
		this(name, 0, "Nil");
	}

	public Person(String name, int age) {
		// this.name = name;
		// this.age = age;
		this(name, age, "Nil");
	}

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void sayName() {
		String name = "Local";
		System.out.println("im " + name);
		System.out.println("im " + this.name);
	}
}




public class Ex1 {

	public static void main(String[] args) {

		Person person = new Person("Nag", 33, "CHN");
		person.sayName();

	}

}
