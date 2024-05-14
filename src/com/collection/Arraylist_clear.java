package com.collection;

import java.util.ArrayList;

public class Arraylist_clear {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("aaaa");
		arrayList.add("bbb");
		arrayList.add("ccc");
		System.out.println("before  " + arrayList);
		arrayList.clear();
		System.out.println("After clearing list" + arrayList);
	}

}
