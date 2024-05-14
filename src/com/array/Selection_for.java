package com.array;

public class Selection_for {

	public Selection_for() {
		int a[] = { 2, 32, 23, 12, 43, 6, 4, 7, 5 };
		int min;
		int temp;
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = 1; j < a.length; j++) {

				if (a[j] < a[min]) {
					min = j;
				}

			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
