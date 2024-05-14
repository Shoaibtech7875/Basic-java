package com.array;

public class Array_Print {

	public static void main(String[] args) {
		
		int [][]a= {{23,43,65,67,},{9,12,43,54}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
