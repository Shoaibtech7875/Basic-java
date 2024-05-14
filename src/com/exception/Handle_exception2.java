package com.exception;

public class Handle_exception2 {
	
	public static void main(String[] args) {
		int a=40;
		int j=0;
		int data;
		
		try {
			data=a/j;
		} catch (Exception e) {
			System.out.println(a/(j+2));
		}
		
	}

}

