package com.abtraction;

abstract class Shape {

	abstract void drow();
}

class Rectengle extends Shape {

	void drow() {
		System.out.println("Drow Rectengle");
	}

}

class Circle extends Shape {
	void drow() {
		System.out.println(" Drow Circle");
	}
}

class TextAbstract {

	public static void main(String[] args) {
		Shape r1 = new Circle();

		r1.drow();

	}

}