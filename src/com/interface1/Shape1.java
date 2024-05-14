package com.interface1;

interface Rectengle {
	void drow();
}

class Circle implements Rectengle {
	public void drow() {

		System.out.println(" Drowing Circle");
		System.out.println(2 + 3);
	}

}

class Angle implements Rectengle {
 public	void drow() {
		System.out.println("Drowing Angle");
	}
}

public class Shape1 {

	public static void main(String[] args) {
		Rectengle rectengle=new Circle();
		rectengle.drow();
		
		

	}

}
