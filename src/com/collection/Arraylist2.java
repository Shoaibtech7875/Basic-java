package com.collection;

import java.util.ArrayList;


public class Arraylist2 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>(5);
		arrayList.add("Adil noor");
		arrayList.add("faiz");
		arrayList.add("arhaan");
		arrayList.add("saeemr");
		arrayList.add("yasir");
		System.out.println(arrayList);

		/*Iterator<String> itrator = arrayList.iterator();
		
		while (itrator.hasNext()) {
			System.out.println(itrator.next());*/
			String element = arrayList.get(3);

			System.out.println("the element at index 2 is : " + element);
		}

	}


