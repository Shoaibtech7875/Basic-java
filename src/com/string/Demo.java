package com.string;

public class Demo {

	public static void main(String[] args) {

		String a = "Shoaib";
		for (int i = 0; i < a.length(); i++) {
			if (i % 2 != 0) {
				System.out.println("integer value : " + i + " char value : " + a.charAt(i));

			}

		}
	}

}
