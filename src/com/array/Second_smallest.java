package com.array;

public class Second_smallest {

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 8, 4, 2 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			
			

		}
		

	}

}
