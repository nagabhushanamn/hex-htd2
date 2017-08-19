package com;

abstract class Super {
	void mm() {

	}

	abstract void abs();
}

class Sub extends Super {

	@Override
	void mm() {

	}
	
	@Override
	synchronized void abs() {
		// TODO Auto-generated method stub
		
	}

	@Deprecated
	public void v1() {
		System.out.println(".....");
	}

	public void v2() {
		System.out.println(".....");
	}

}

public class Ex {

	public static void main(String[] args) {

	}

}
