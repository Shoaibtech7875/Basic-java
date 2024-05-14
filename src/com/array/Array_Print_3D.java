package com.array;

public class Array_Print_3D {

	public static void main(String[] args) {
		int [][][] a= {{{23,54,},{12,76,98},{33,66,35,87}}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.println(a[i][j][k]+" ");
					
				}
				System.out.println();
				
			}
			System.out.println();
			
		}

	}

}
