package com.string;

public class Revers {

	public static void main(String[] args) {
		String name="Shoaib";
		String rev="";
		int lang=name.length();
		for (int i = lang-1; i >=0; i--) {
			rev= rev + name.charAt(i);
		}
		System.out.println(rev);
	}

}
