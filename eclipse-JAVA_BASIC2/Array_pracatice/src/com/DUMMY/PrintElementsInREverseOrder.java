package com.DUMMY;

import java.util.Arrays;

public class PrintElementsInREverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]  = {1,2,3,4,5};
		System.out.println("initial array" +Arrays.toString(a));
        arraysReverse(a);
	}

	private static void arraysReverse(int[] a) {
		// TODO Auto-generated method stub

		int s = a.length;
		for(int i=s-1 ;i>=0 ;i--) {
			System.out.println(a[i]);
		}
		
		
	}

}
