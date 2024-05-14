package com.collection;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>(5);
		arrayList.add(23);
		arrayList.add(43);
		arrayList.add(76);
		arrayList.add(43);

		arrayList.add(3, 65);
		for (Integer number : arrayList) {
			System.out.println("Number " + number);

		}

	}

}
