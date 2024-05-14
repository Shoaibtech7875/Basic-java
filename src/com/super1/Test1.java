package com.super1;

class Animals {
	String color = "Black";

}

class Dog extends Animals {
	String color = "White";

	void printcolor() {
		System.out.println(color);
		System.out.println(super.color);
	}

}

public class Test1 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.printcolor();
	}
}
