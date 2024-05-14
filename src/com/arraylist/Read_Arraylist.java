package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Read_Arraylist {

	public static void main(String[] args) {
		try {
			ArrayList<Character> list = new ArrayList<>();
			list.add('A');
			list.add('B');
			list.add('C');
			list.add('D');
			list.add('E');

			System.out.println("Print list: " + list);

			List<Character> imutableList = Collections.unmodifiableList(list);
			System.out.println("Readonly Arraylist: " + imutableList);

			System.out.println("Trying Modify  The Readonly Arrayl ist");
			imutableList.add(3,'T');
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
