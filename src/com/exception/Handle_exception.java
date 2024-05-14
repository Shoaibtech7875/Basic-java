package com.exception;

public class Handle_exception {

	public static void main(String[] args) {
		
		try {
			int a=30/0;
		} catch (Exception e) {
			System.out.println("ArithmeticException");
		}

	}

}
