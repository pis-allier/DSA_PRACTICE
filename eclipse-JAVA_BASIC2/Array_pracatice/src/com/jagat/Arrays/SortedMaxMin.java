package com.jagat.Arrays;

import java.util.Arrays;

//sorted maximum and minimum in order 
public class SortedMaxMin {

	public static void main(String[] args) {
		int a[] = { 8, 1, 2, 5, 3, 4, 9 };
		System.out.println("original araya==>" + Arrays.toString(a));

		sortedArray(a);
		System.out.println("sorted array==>" + Arrays.toString(a));

	}

	public static void sortedArray(int a[]) {
		Arrays.sort(a);
		int even = 0;
		int odd = a.length - 1;
		int result[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				result[i] = a[odd];
				odd--;
			} else {
				result[i] = a[even];
				even++;

			}
		}
		System.arraycopy(result, 0, a, 0, a.length);
	}
}
