package com.DSA.TWO_POINTERS;

import java.util.Arrays;

//subsequence that satisfy condition
/*
 * You are given an array of integers nums and an integer target.

Return the number of non-empty subsequences of nums such that the sum of the minimum and maximum element on it is less or equal to target. 
Since the answer may be too large, return it modulo 109 + 7.
Example 1:
Input: nums = [3,5,6,7], target = 9
Output: 4
Explanation: There are 4 subsequences that satisfy the condition.
[3] -> Min value + max value <= target (3 + 3 <= 9)
[3,5] -> (3 + 5 <= 9)
[3,5,6] -> (3 + 6 <= 9)
[3,6] -> (3 + 6 <= 9)
 * 
 */
public class SubsequenceSatisfyCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 3, 3, 6, 8 };
		int target = 9;
		int count = findSubsqSatifyCondition(a, target);
		System.out.print(count);

	}

	private static int findSubsqSatifyCondition(int[] nums, int target) {
		// TODO Auto-generated method stub
		final int MOD = 1000000007;

		Arrays.sort(nums); // Step 1

		long[] powersOfTwo = new long[nums.length + 1];
		powersOfTwo[0] = 1;
		for (int i = 1; i <= nums.length; i++)
			powersOfTwo[i] = (powersOfTwo[i - 1] * 2) % MOD; // Step 2

		int count = 0, right = nums.length - 1, left = 0;
		while (left <= right) { // Step 3
			int sum = nums[right] + nums[left]; // Calculate sum of min and max
			if (sum > target) { // Check if sum is greater than target
				long seqs = powersOfTwo[right - left] - 1; // Calculate number of subsequences
				count = (int) ((count + seqs + 1) % MOD); // Update count
				right--; // Move right pointer leftward
			} else {
				left++; // Move left pointer rightward
			}
		}

		long totalSeqs = powersOfTwo[nums.length] - 1; // Calculate total number of subsequences
		return (int) ((totalSeqs - count + MOD) % MOD); // Return result modulo MOD
	}

}
