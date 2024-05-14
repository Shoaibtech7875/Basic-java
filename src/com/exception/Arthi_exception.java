package com.exception;

public class Arthi_exception {

	public static void main(String[] args) {
		try {
			int a=100/0;
			//System.out.println(a);
		} catch (Exception e) {
			System.out.println(e);
			
		}
		System.out.println("rest of code............");
	}

}
