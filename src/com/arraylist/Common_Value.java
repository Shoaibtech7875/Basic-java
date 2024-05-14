package com.arraylist;

import java.util.ArrayList;

public class Common_Value {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("yasir");
		list1.add("gufran");
		list1.add("shoaib");
		list1.add("yasir");
		list1.add("Shoaib");
		list1.add("Shoaib");
		list1.add("Shoaib");
		System.out.println("First List Element" + list1);

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("for");
		list2.add("Shoaib");
		list2.add("yasir");
		System.out.println("Second list2 Elemnt" + list2);

		list1.retainAll(list2);

		System.out.println("Common property: " + list1);

	}

}
