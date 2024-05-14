package com.collection;

import java.util.AbstractList;
import java.util.ArrayList;

public class Equal_method {

	public static void main(String[] args) {

		try {

			AbstractList<String> list = new ArrayList<String>();

			list.add("A");
			list.add("B");
			list.add("c");
			System.out.println(list);

			AbstractList<String> list2 = new ArrayList<>();
			list2.add("A");
			list2.add("B");
			list2.add("c");
			System.out.println(list2);
			boolean value = list.equals(list2);
			System.out.println("opretion is : " + value);
			if (list.equals(list2)) {
				System.out.println("list and list2 equals");

			} else {
				System.out.println("list and list2 is not equal  ");

			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
