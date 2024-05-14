package com.array;

public class Max {

	public static void main(String[] args) {
		int a[] = { 2, 3, 2, 5, 4 };
		int b[] = { 3, 2, 1, 4 ,5};

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);

				}
			}
		}

	}

}
