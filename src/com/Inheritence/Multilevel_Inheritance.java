package com.Inheritence;

class Animal {
	void eat() {
		System.out.println(" eating ...............");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println(" barking ..............");
	}
}

class Cat extends Dog {
	void cat() {
		System.out.println(" jumping ...............");
	}
}

public class Multilevel_Inheritance extends Cat {

	public static void main(String[] args) {
		Multilevel_Inheritance multilevel_Inheritance = new Multilevel_Inheritance();
		System.out.println(".......................................");
		multilevel_Inheritance.eat();
		System.out.println(".......................................");
		multilevel_Inheritance.bark();
		System.out.println(".......................................");
		multilevel_Inheritance.cat();
		System.out.println(".......................................");

	}

}
