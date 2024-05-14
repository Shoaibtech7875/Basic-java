package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Split_Arraylist {
	public static List[] Split(ArrayList<String> list) {
		
		List<String> first=new ArrayList<>();
		List<String> second=new ArrayList<>();
		
		int size=list.size();
		
		for (int i = 0; i < size/2; i++) 
			first.add(list.get(i));
			
			for (int i = size/2; i < size; i++) 
				second.add(list.get(i));
			
		
		
		return new List[] {first,second};
	}
	

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		
		List[] lists=Split(list);
		
		System.out.println("First Element :"+lists[0]);
		System.out.println("Second Element :"+lists[1]);
	}

	

}
