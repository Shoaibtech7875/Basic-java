package com.arraylist;

import java.util.ArrayList;

public class Common_Value2 {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("aaa");
		list1.add("bbb");
		list1.add("ccc");
		list1.add("aaa");
		list1.add("bbb");
		System.out.println("First Element : " + list1);

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("aaa");
		list2.add("bbb");
		list2.add("ddd");
		list2.add("ddd");
		System.out.println("Second Element :" + list2);
		ArrayList<String> list3 = new ArrayList<>(list1);

		list3.retainAll(list2);
		System.out.println("Commmon property: " + list3);

	}

}
