package com.Inheritence;

class Nokia1{
	 Nokia1(){
		 System.out.println(" execute the second constractor");
	 }
	
	int x,y;
	
	void f1() {
		System.out.println("This is a f1 method");
	}
	void f2() {
		System.out.println(" This is a f2 method ");
	}
}
class Nokia2 extends Nokia1{
	Nokia2(){
		System.out.println(" execute the first constractor");
	}
	int z;
	void f3() {
		System.out.println(" This is a f3 method ");
	
	}
}



public class Single_Inheritence1 {

	public static void main(String[] args) {
		Nokia2 nokia2=new Nokia2();
//		nokia2.f1();
//		nokia2.f2();
//		nokia2.f3();

	}

}
