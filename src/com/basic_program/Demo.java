package com.basic_program;
class Mahesh{
	int x;
	int y;
	
	void fun1() {
		System.out.println(" fun 1");
		
	}
	void fun2() {
		System.out.println(" fun 2");
		
	}
	
}
public class Demo {

	public static void main(String[] args) {
		
		Mahesh m1=new Mahesh();
		Mahesh m2=new Mahesh();
		m2.y=36;
		System.out.println(m2.y);
		m1.fun1();
		m2.fun2();
		
		m1.x=45;
		System.out.println(m1.x);
		
		

	}

}
