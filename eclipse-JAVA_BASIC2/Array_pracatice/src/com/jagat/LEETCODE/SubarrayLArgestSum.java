package com.jagat.LEETCODE;

public class SubarrayLArgestSum {

	public static void main(String[] args) {

		int a[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result = subArraySum(a);
		System.out.println("sub array sum is ==>" + result);

	}

	public static int subArraySum(int a[]) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {

				sum += a[j];
				maxSum = Math.max(maxSum, sum);

			}
		}
		return maxSum;
	}

}
