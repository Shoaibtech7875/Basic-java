package com.basic_program;

public class Wrraper_class {

	public static void main(String[] args) {
		int x = Integer.parseInt("123");
		System.out.println(x);

		Integer h1 = Integer.valueOf("100101", 2);
		int z = h1.intValue();
		System.out.println(z);

		Double x1 = Double.valueOf("2334");
		double y = x1.doubleValue();

		System.out.println(y); 

	}

}
