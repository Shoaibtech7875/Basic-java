package com.basic_program;

class Firefox{
	int x;
	private static int y;
	
	void fun1() {
		y=22;
	}
	void fun2() {
		System.out.println(y);
	}
	void fun3() {
		y=67;
	}
	
}

public class Private_member {

	public static void main(String[] args) {
			
		 Firefox firefox=new  Firefox();
		 Firefox firefox1=new  Firefox();
		 firefox.fun1();
		 firefox1.fun3();
		 firefox.fun2();
	}

}
