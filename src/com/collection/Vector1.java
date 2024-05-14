package com.collection;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
	Vector<String> vector=new Vector<>();
	vector.add("shaoib");
	vector.add("Arhan");
	vector.add("adil noor");
	vector.add("sameer");
	vector.add("faiz");
	
	
	Iterator<String> itrator=vector.iterator();
	while (itrator.hasNext()) {
		System.out.println(itrator.next());
		
	}

	}

}
