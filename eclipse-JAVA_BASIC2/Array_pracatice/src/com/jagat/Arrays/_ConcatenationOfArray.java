package com.jagat.Arrays;

import java.util.Arrays;

//array concatenation
public class _ConcatenationOfArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 ,4,5,6};
		int n = a.length;

		concatArray(a, n);
	}

	public static void concatArray(int[] a, int n) {
		int x[] = new int[2 * n];

		for (int i = 0; i < a.length; i++) {
				x[i] = a[i];
				x[i + n] = a[i];
			
		}
		System.out.println(Arrays.toString(x));
	}
}
