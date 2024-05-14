package com.arraylist;

import java.util.ArrayList;

public class Sub_list extends ArrayList<String>{

	public static void main(String[] args) {
			
			Sub_list list=new Sub_list();
			list.add("aaa");
			list.add("bbb");
			list.add("ccc");
			list.add("ddd");
			list.add("eee");
			list.add("ppp");
			list.add("uuu");
			System.out.println("Orginal List :"+list);
			
			//list.subList(2, 6).clear();
			list.removeRange(2, 5);
			System.out.println("final List :"+list);
			
	}

}
