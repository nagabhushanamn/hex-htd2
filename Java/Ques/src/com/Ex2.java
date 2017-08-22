package com;

class Employee {
	private int id;
	public String name;
	private double salary;

	public Employee(int id) {
		this.id = id;
	}
}

class JavaTechEmployee extends Employee {
	public String javaSkill;

	public JavaTechEmployee(int id, String name) {
		super(id);
		this.name = name;
	}
}

class JSEmployee extends Employee {
	public JSEmployee(int id) {
		super(id);
	}

	public String jsSkill;
}

class A extends Object {

	public A() {
		super();
		System.out.println("im A");
	}

}

class B extends A {

	public B(int a) {
		// super(a);
		System.out.println("im B");
	}

	public B(int a, int b) {
		// super(a);
		// this(a);
	}

}

class C extends B {
	public C(int a) {
		super(a);
		System.out.println("im C");
	}
}

public class Ex2 {

	public static void main(String[] args) {

		JavaTechEmployee javaTechEmployee = new JavaTechEmployee(12, "Naga");
		javaTechEmployee.javaSkill = "spring";

		// ---------------------------------------

		// javaTechEmployee.id = 0;

		// ----------------------------------------

		C c = new C(12);

	}

}
