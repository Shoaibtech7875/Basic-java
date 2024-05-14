package com.interface1;

interface Demo{
	int cube(int x );
}
class Cube1 implements Demo{
	public int cube(int x) {
		return x*x*x;
	}
}


public class Rectengle1 {

	public static void main(String[] args) {
		
		Demo demo=new Cube1();
		System.out.println(demo.cube(5));
	}

}
