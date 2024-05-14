package com.array;

public class Array_return {

	
	static int[] get() {
		
		return new int[] {23,43,54};
	}
	public static void main(String[] args) {
		int arr[]=get();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
