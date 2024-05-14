package com.super1;

class Cat{
	 Cat() {
		System.out.println(" Creating .........");
		System.out.println(a);
	}
	int a=28;
}

class Mode extends Cat{
	 Mode() {
		super();
		
		System.out.println("mewo............");
	}
}

public class Test3 {

	public static void main(String[] args) {
		Mode dog=new Mode();
		
	}

}
