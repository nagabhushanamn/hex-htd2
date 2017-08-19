package com;

import java.util.HashMap;
import java.util.Scanner;

class Owner {
	String name;

	public Owner(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

class Bike {

	String model;
	String color;

	public Bike(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bike [model=" + model + ", color=" + color + "]";
	}

}

public class Quiz {

	public static void main(String[] args) {

		Owner owner1 = new Owner("Nag");
		Owner owner2 = new Owner("Kannan");

		Bike bike1 = new Bike("Royal", "black");
		Bike bike2 = new Bike("Royal", "Red");

		// ------------------------------------------

		HashMap<Owner, Bike> hashMap = new HashMap<>();
		hashMap.put(owner1, bike1);
		hashMap.put(owner2, bike2);

		// -------------------------------------

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Owner name ?");
		String name = scanner.nextLine();

		Owner key = new Owner(name);

		Bike bike = hashMap.get(key);

		if (bike != null)
			System.out.println(bike);
		else
			System.out.println("dream it");

	}

}
