package com.super1;

class Aninals {
	void eat() {
		System.out.println("eating .....");
	}
}

class Elephent extends Aninals {
	void eat() {
		System.out.println("Eating2.....");
	}

	void bark() {
		System.out.println(" barking ........");
	}

	void work() {
		super.eat();
		bark();
		eat();
	}
}

public class Test4 {

	public static void main(String[] args) {

		Elephent elephent = new Elephent();
		elephent.work();
	}

}
