package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Delete_dup {

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {

		ArrayList<Integer> newlist = new ArrayList<>();

		for (Integer element : list) {

			if (!newlist.contains(element)) {

				newlist.add(element);

			}
		}

		return newlist;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 5, 3, 3, 5, 6, 5, 7, 6, 8));

		System.out.println("ArrayList with Duplicate" + list);

		ArrayList<Integer> newlist = removeDuplicates(list);
		System.out.println("removeDuplicates: " + newlist);

	}

}
