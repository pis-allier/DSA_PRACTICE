package com.jagat.Array;

import java.util.Arrays;

/*
 * You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, 
 * one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.
Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:
Input: nums = [1,1]
Output: [1,2]
 * 
 */
public class SetMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 1, 2, 2, 4 };
		int res[] = new int[2];
		res = findMissingAndRepeated(nums);
		for (Integer x : res) {
			System.out.print(x + " ");
		}
	}

	private static int[] findMissingAndRepeated(int[] nums) {
		// TODO Auto-generated method stub
		int n = nums.length;
		int[] result = new int[2];

		Arrays.sort(nums);

		// Find the duplicate number
		for (int i = 1; i < n; i++) {
			if (nums[i] == nums[i - 1]) {
				result[0] = nums[i];
				break;
			}
		}

		// Find the missing number
		int expectedSum = n * (n + 1) / 2;
		int actualSum = Arrays.stream(nums).sum();
		result[1] = expectedSum - (actualSum - result[0]);

		return result;
	}

}
