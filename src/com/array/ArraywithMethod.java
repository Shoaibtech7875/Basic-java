package com.array;

public class ArraywithMethod {
	static void min(int arr[]) {
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min>arr[i]) {
				min=arr[i];
				System.out.println(min);
				
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {58,43,50,51};
		min(arr);

	}

}
