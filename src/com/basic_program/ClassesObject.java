package com.basic_program;

 class Nokia{
	 private static int mic;
	 private static int cemara;
	 
	 void setvalue() {
		 mic=2;
		 cemara=50;
		 
	 }
	 void display() {
		 System.out.println(mic);
		 System.out.println(cemara);
	 }
 }

public class ClassesObject  {

	public static void main(String[] args) {
		 Nokia nokia=new Nokia();
		 nokia.display();
		 nokia.setvalue();
		 nokia.display();

	}

}
