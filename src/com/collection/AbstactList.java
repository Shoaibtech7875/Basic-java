package com.collection;

import java.util.*;

public class AbstactList {

	public static void main(String[] args) throws IndexOutOfBoundsException {
		try {

			AbstractList<String> list = new ArrayList<String>();
			list.add("A");
			list.add("B");
			list.add("C");
			System.out.println("First List " + list);

			AbstractList<String> list2 = new ArrayList<>();

			list2.add("D");
			list2.add("E");
			list2.add("F");

			System.out.println("Second List2 " + list2);
			boolean value = list.addAll(-1, list2);
			// boolean value=list.addAll(list2);

			System.out.println("opration successfuly " + value);

			System.out.println("fainal opretion " + list);

		} catch (NullPointerException e) {
			System.out.println("Exceprion " + e);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println(" Exception " + e);
		}

	}

}
