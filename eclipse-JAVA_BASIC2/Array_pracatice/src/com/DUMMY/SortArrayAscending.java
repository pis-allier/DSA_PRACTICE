package com.DUMMY;

import java.util.Arrays;

public class SortArrayAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 2, 8, 7, 1 };
		System.out.println("Initial array is " + Arrays.toString(a));
		int res[] = new int[a.length];
		res = arrarSort(a);
		System.out.println("ascending order" + Arrays.toString(res));

	}

	private static int[] arrarSort(int[] a) {
		// TODO Auto-generated method stub

		int s = a.length;
		for (int i = 0; i < s; i++) {
			for (int j = i+1; j < s; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		return a;
	}

}
