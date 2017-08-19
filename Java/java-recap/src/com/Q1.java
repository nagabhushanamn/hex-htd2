package com;

/*
 *  object
 *  --------
 *  
 *   1. Front-End / Interface / Abstraction
 *   
 *   	why we need ?
 *   
 *       --> shud easy to use/learn by dependent
 *       --> for loose-coupling
 *   
 *   -> Back-End  / implementation / Encapsulation
 *   
 *       --> hide complexity
 *       --> for security...
 *   
 *   
 *   
 *   how to implement in java ?
 *   
 *   
 *   many ways
 *   
 *   --> using access specifiers
 *   --> using packages
 *   --> using accesor methods ( set & get )
 *   
 *   
 *   --> interface / class  
 *   
 *   
 *   -------------------------------------
 * 
 */

interface Wheel {
	void rotate();

	default void defaultMethod() {
		System.out.println("Wheel default method");
	}

	static void staMethod() {
		System.out.println("Wheel.staMethod");
	}

}

class MRFWheel implements Wheel {
	public void rotate() {
		System.out.println("MRFWheel rotating...");
	}
}

class CEATWheel implements Wheel {
	public void rotate() {
		System.out.println("CEATWheel rotating...");
	}

	@Override
	public void defaultMethod() {
		System.out.println("CEAT new behav to wheels");
	}
}

class Car {
	private Wheel wheel;

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void move() {
		wheel.rotate();
		System.out.println("Car Moving..");
	}
}

public class Q1 {

	public static void main(String[] args) {

		Car car = new Car();
		Wheel mrfWheel = new MRFWheel();
		CEATWheel ceatWheel = new CEATWheel();
		car.setWheel(ceatWheel);
		car.move();

	}

}
