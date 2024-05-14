package com.arraylist;


import java.util.*;


public class Covert_Arraylist_to_Array {

	public static Object[] convertLinkedListToArray(LinkedList<String> linkedList) {
		Object[] array = linkedList.toArray(); 
		return array;
	}

	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<>();
	linkedList.add("Shaoib");
	linkedList.add("Gufran");
	linkedList.add("yasir");
	linkedList.add("rizwan");
	linkedList.add("arman");
	System.out.println("Reale Arraylist"+linkedList);
	
	Object[]  objarray=convertLinkedListToArray(linkedList);
	
	String[]	array=Arrays.copyOf(objarray,objarray.length,String[].class);
	
	System.out.println(Arrays.toString(array));
	}

	

}
