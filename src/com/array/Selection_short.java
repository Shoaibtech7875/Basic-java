package com.array;

public class Selection_short {

	public static void main(String[] args) {
		int a[] = { 23, 32, 56, 54, 76, 12, 21 };
		int temp;
		int j;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			j = i;
			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j = j - 1;

			}
			a[j]=temp;

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
