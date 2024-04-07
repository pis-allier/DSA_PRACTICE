package com.DUMMY;

import java.util.Arrays;

public class MinDiffSubArray {
//minimum difference subarray
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 7, 6, 8, 1, 5 };
		int minDifference = minDifferenceArray(a);
		System.out.println(minDifference);
	}

	private static int minDifferenceArray(int[] a) {
		// TODO Auto-generated method stub
		int size = a.length;
		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < size - 1; i++) {
			for (int j = i; j < size; j++) {
				int sum1 = Arrays.stream(Arrays.copyOfRange(a, i, j + 1)).sum();
				int sum2 = Arrays.stream(Arrays.copyOfRange(a, j + 1, size)).sum();

				int currentDiff =Math.abs( sum1 - sum2);
				minValue = Math.min(minValue, currentDiff);

			}
		}

		return minValue;
	}

}
