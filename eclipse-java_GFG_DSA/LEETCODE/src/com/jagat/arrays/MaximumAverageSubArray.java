package com.jagat.arrays;

/*
 * You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 
Any answer with a calculation error less than 10-5 will be accepted.
Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000
 */
public class MaximumAverageSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		double maxAvg = findMaximumAvgSubArray(nums, k);
		System.out.println(maxAvg);
	}

	private static double findMaximumAvgSubArray(int[] nums, int k) {
		double maxAvg = Integer.MIN_VALUE;

		for (int i = 0; i <= nums.length - k; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += nums[j];
			}
			double avg = (double) sum / k; // Calculate average for current subarray
			maxAvg = Math.max(maxAvg, avg);
		}

		return maxAvg;
	}

}
