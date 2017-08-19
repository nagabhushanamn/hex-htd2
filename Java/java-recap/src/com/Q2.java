package com;

abstract class LivingThing {

	public void eat() {
		System.out.println("LT-eat()");
	}

	public final void sleep() {
		System.out.println("LT-sleep");
	}

	public abstract void work();
}

class Human extends LivingThing {

	public void study() {
		System.out.println("HUman study");
	}

	@Override
	public void work() {
		System.out.println("HUman work..");
	}

}

class Animal extends LivingThing {

	@Override
	public void work() {
		System.out.println("Animal work");
	}

}

class Robot extends LivingThing {
	@Override
	public void eat() {
		System.out.println("Robot Eat..");
	}

	@Override
	public void work() {
		System.out.println("Robot work..");
	}
}

// ---------------------------------------------------------

class God {

	// public void manageHuman(Human human) {
	// human.eat();
	// human.sleep();
	// human.study();
	// human.work();
	// }
	//
	// public void manageAnimal(Animal animal) {
	// animal.eat();
	// animal.sleep();
	// animal.work();
	// }

	public void manageLT(LivingThing liveT) {
		liveT.eat();
		liveT.sleep();
		liveT.work();
	}

}

public class Q2 {

	public static void main(String[] args) {

		God god = new God();

		// LivingThing livingThing = new LivingThing();

		Human human = new Human();
		Animal animal = new Animal();
		Robot robot = new Robot();

		// god.manageHuman(human);
		god.manageLT(human);
		System.out.println();
		// god.manageAnimal(animal);
		god.manageLT(animal);
		System.out.println();
		god.manageLT(robot);

	}

}
