package com.collection;

class Test {

	int x, y;

	public Test() {
		x = 20;
		y = 10;
	}
}

public class Clone {

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.x + " " + test.y);

		Test test2 = test;

		test2.x = 100;
		System.out.println(test.x + " " + test.y);
		System.out.println(test2.x + " " + test2.y);

	}
}