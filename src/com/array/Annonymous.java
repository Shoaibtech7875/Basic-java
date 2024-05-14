package com.array;

public class Annonymous {

	public static void main(String[] args) {
		Annonymous.sum(new int[]{ 2, 3, 5, 7 });

	}
		static void sum(int[] no) {
		int total = 0;
		for (int i : no) {
			total = total + i;
			System.out.println("Sum is "+total);
		}

	}

}
