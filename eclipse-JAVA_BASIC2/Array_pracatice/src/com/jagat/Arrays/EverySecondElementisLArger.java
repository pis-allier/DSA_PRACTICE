package com.jagat.Arrays;

import java.util.Arrays;

public class EverySecondElementisLArger {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 };

		System.out.println("original array ===> " + Arrays.toString(a));
		checkLeftRight(a);
		System.out.println("sorted Array ==> " + Arrays.toString(a));
	}

	public static void checkLeftRight(int a[]) {
		for (int i = 1; i < a.length - 1; i = i + 2) {
			if (a[i] < a[i - 1] || a[i] < a[i + 1]) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}
	}
}
