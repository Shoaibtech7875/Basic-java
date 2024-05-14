package com.basic_program;

class Mobile{
	 int x, y;

	void f1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void Display() {

		System.out.println(x);
		System.out.println(y);
	}
}
class Example1 extends Mobile{
	int x,y;
	void f2() {
		super.x=x;
		super.y=y;
	}
	void f3() {
		
		System.out.println(super.x);
		System.out.println(this.y); {
			
		}
	}
	
}


public class Super_keyword {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.f1(7,80);
		mobile.Display();

	}

}
