package com.exception;

public class IndexOfbound {

	public static void main(String[] args) {
		int arr[]= {2,4,3,2,4};
		try {
			System.out.println(arr[10]);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
