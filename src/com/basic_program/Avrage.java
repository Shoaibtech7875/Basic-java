package com.basic_program;

public class Avrage {

	public static void main(String[] args) {
		String[] a= {"23,43,54,32,54,43,5"};
		int i;
		int s = 0;
		for (int i1 = 0; i1 < a.length; i1++) {
			s=s+Integer.parseInt(a[i1]);
			System.out.println("Avarage is "+ s/a.length);
			
		}

	}

}
