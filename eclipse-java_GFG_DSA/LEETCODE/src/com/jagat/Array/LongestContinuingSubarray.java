package com.jagat.Array;

/*
 * Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray). 
 * The subsequence must be strictly increasing.
A continuous increasing subsequence is defined by two indices l and r (l < r)
 such that it is [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].
Example 1:
Input: nums = [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
4.
 */
public class LongestContinuingSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 3, 5, 4, 7, 8, 9, 10 };
		int length = findLongestContinuousSubArray(a);
		System.out.println(length);
	}

	private static int findLongestContinuousSubArray(int[] a) {
		// TODO Auto-generated method stub

		int currLength = 1;
		int maxLength = -1;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i + 1]) {
				currLength++;
			} else {
				maxLength = Math.max(maxLength, currLength);
				currLength = 1;
			}
		}
		maxLength = Math.max(maxLength, currLength);
		return maxLength;
	}

}
