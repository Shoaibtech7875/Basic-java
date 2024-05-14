package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Convert_itrTo_List {

	private static List<Integer> getListFromIterator(Iterator<Integer> itrator) {

		List<Integer> list = new ArrayList<>();

		itrator.forEachRemaining(list::add);

		return list;
	}

	public static void main(String[] args) {

		Iterator<Integer> itrator = Arrays.asList(2, 3, 5, 4, 6, 7).iterator();
		List<Integer> list = getListFromIterator(itrator);

		System.out.println(list);
	}

}
