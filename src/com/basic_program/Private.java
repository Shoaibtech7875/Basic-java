package com.basic_program;
class Animal{
	 private static int  x;
	private static int y;
	
	 static void fun1() {
		 x=32;
		 System.out.println(x);
		
	}
	static void fun2() {
		 y=12;
		System.out.println(y);
	}
}
public class Private {

	public static void main(String[] args) {
		Animal.fun1();
		Animal.fun2();
		
		

	}

}
