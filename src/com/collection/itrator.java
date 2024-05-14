package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class itrator {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(2999);
		list.add("shaoib");
		list.add(400);
		list.add(1000);
		list.add("gufran");
		list.add("adil noor");
		
		System.out.println(list);

		Iterator itr = list.iterator(); 

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
