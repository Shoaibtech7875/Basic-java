package com.arraylist;


import java.util.ArrayList;

public class CommonValue {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("a");
		list1.add("b");
		list1.add("a");
		list1.add("c");
		System.out.println(" First Element : " + list1);
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("a");
		list2.add("b");
		list2.add("b");
		list2.add("c");
		System.out.println("Second Element :" + list2);

		ArrayList<String> list3 = new ArrayList<>(list2);
		for (String temp : list1) {

			if (list2.contains(list3)) {
				list3.add(temp);

			}

		}
		System.out.println("Common property :" + list3);

	}

}
