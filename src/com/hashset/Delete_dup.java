package com.hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Delete_dup {

	private static ArrayList<Integer> removeduplicates(ArrayList<Integer> list) {
		HashSet list2 = new HashSet();
		
		list2.addAll(list);

		list.clear();

		list.addAll(list2);
		
		return list;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 4, 6, 7, 8, 76, 2, 56, 33, 44));
		
		System.out.println("Arraylist with Duplicate" + list);

		ArrayList<Integer> newlistArray = removeduplicates(list);
		
		System.out.println("Duplicates :" + newlistArray);

	}

}
