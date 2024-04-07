package com.jagat.GFGPRACTICE;

import java.util.Arrays;

//print all the subarrays
public class PrintSubarrrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("originasl array==>" + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print("["+a[k] +"]");
					
				}
				
				System.out.println();
			}
		}

	}

}
