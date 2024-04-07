package com.DUMMY2;

import java.util.Arrays;

public class PlusOneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 6, 3, 9,9  };
		int arr[] = plusOneArrayAdd(a);
		System.out.println("new Array===> after adding one is  " + Arrays.toString(arr));
	}

	private static int[] plusOneArrayAdd(int[] a) {
		// TODO Auto-generated method stub
		int n = a.length;
		for (int i = n - 1; i > 0; i--) {
			if (a[i] < 9) {
				a[i]++;
				return a;
			}
			a[i] = 0;
		}
		int[] newArray = new int[n + 1];
		newArray[0] = 1;
		return newArray;
	}

}
