package com.collection;

import java.util.ArrayList;

public class Arraylist_addall {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList1 = new ArrayList<>(7);
		arrayList1.add(32);
		arrayList1.add(54);
		arrayList1.add(12);
		arrayList1.add(76);
		System.out.println("Printing arrayList1");
		for (Integer element : arrayList1) {
			System.out.println(element);

		}

		ArrayList<Integer> arrayList2 = new ArrayList<>(7);

		arrayList2.add(3);
		arrayList2.add(4);
		arrayList2.add(6);
		arrayList2.add(7);
		System.out.println("Printing arrayList2");
		for (Integer nomber : arrayList2) {
			System.out.println(nomber);
		}
		System.out.println("Printing all the elements");

		arrayList1.addAll(2, arrayList2);
		for (Integer number : arrayList1) {
			System.out.println(number);

		}
	}

}
