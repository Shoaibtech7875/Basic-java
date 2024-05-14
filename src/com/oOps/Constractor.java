package com.oOps;

class Demo{
	
	int x;
	int y;
	
	
	void f1() {
		 x=25;
		 y=26;
		 System.out.println(x+" "+y);
		
	}
	void f2() {
		 x=32;
		 y=30;
		 System.out.println(x+" "+y);
	}
	public Demo(int r,int p) {
		x=r;
		y=p;
//		 x=20;
//		 y=43;
	System.out.println(x+" "+y);	

	}
}

public class Constractor {
	
	

	public static void main(String[] args) {
		Demo demo=new Demo(23,54);
		Demo demo1=new Demo(32,54);
		

	}

}
