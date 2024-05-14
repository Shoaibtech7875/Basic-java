package com.collection;

import java.util.ArrayList;

public class Method_all {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(2000);
		arrayList.add(" shoaib");
		arrayList.add(5000);
		arrayList.add(" gufran");

		System.out.println(arrayList);
		System.out.println("---------------------");

		ArrayList arrayList2 = new ArrayList();

		arrayList2.add(" arhan");
		arrayList2.add(7000);
		arrayList2.add("Adil noor");
		arrayList2.add(" sameer");
		System.out.println(arrayList2);
		System.out.println("---------------------");

		System.out.println(arrayList2.addAll(arrayList));
		System.out.println("---------------------");
		
		System.out.println(arrayList2);
		System.out.println("---------------------");

		System.out.println(arrayList2.isEmpty());
		System.out.println("---------------------");
		
		System.out.println(arrayList2.contains(7000));
		System.out.println("---------------------");
		System.out.println(arrayList2.size());
		
		arrayList2.remove("Adil noor");
		System.out.println(arrayList2);
		
		arrayList.remove(0);
		System.out.println(arrayList);

	}

}
