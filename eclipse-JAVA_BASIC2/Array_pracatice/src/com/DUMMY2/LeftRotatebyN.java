package com.DUMMY2;

import java.util.Arrays;

public class LeftRotatebyN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50};
		int n = 2;
		System.out.println("original array====>" +Arrays.toString(a));
		rotatebyN(a,n);

	}

	private static void rotatebyN(int[] a, int n) {
		// TODO Auto-generated method stub
		int temp  =a[0];
		for(int i=0; i<n ;i++) {
			 for (int j = a.length - 1; j > 0; j--) {
	                a[j] = a[j - 1];
	            }
			a[0] = temp;
		}
		System.out.println("array after rotation====>" + Arrays.toString(a));
	}

}
