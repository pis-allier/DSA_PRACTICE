package com.jagat.Arrays;

import java.util.Arrays;

public class AddTwoMatrices {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {5,4,3,2,1};
		int c[] = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				c[i] = a[i]+b[i];
				
			}
		}
		System.out.println("add==>"+Arrays.toString(c));
		

	}

}
