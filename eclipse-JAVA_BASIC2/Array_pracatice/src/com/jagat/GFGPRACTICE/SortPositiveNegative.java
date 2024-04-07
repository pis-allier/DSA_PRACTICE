package com.jagat.GFGPRACTICE;

import java.util.Arrays;

// all positive appear before negative
public class SortPositiveNegative {

	public static void main(String[] args) {

		int a[] = { 4,5,6, - 1, -2, -3 };

		System.out.println("original array==>" + Arrays.toString(a));

		sortedArray(a);
		System.out.println("sorted array==>" + Arrays.toString(a));

	}

	public static void sortedArray(int a[]) {
		// two pinter approach
		int left = 0;
		int right = a.length - 1;

		while (left <= right) {
			// find next negative element from left
			while (left < a.length && a[left] < 0) {
				left++;
			}
			// fine next postive from right
			while (right >= 0 && a[right] >= 0) {
				right--;
			}

			if (left < right) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;

			}
		}

	}

}
