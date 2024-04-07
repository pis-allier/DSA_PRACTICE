package com.jagat.GFGPRACTICE;

import java.util.Arrays;
//print all subarrayas with zero sum
public class PrintAllsubarrayWithZeroSum {

	public static void main(String[] args) {
		int a[] = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 };
		System.out.println("original array==>" + Arrays.toString(a));

		// subarrays(a);
		subarraysWithZerosum(a);

	}

	public static void subarraysWithZerosum(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				if (sum == 0) {

					for (int k = i; k <= j; k++) {

						System.out.print(a[k]+"{}");
					}
					System.out.println();
				}
			}
		}

	}
}
