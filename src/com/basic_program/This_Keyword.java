package com.basic_program;

class Example {
	private int x, y;

	void f1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void Display() {

		System.out.println(x);
		System.out.println(y);
	}

}

public class This_Keyword {

	public static void main(String[] args) {

		Example demo = new Example();
		demo.f1(23, 43);
		demo.Display();

	}

}
