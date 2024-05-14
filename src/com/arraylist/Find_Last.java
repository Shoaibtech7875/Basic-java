package com.arraylist;


import java.util.ArrayList;

public class Find_Last {



	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(34);
		list.add(32);
		list.add(89);
		System.out.println(list);
		int first=list.get(1);
		int last=list.get(list.size()-1);
		
		System.out.println("First Element: "+first+"\nlast Element: "+last);
		

	}

}
