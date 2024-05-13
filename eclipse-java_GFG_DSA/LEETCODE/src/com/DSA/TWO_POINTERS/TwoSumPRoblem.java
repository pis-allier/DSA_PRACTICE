package com.DSA.TWO_POINTERS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
 * find two numbers such that they add up to a specific target number. 
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
The tests are generated such that there is exactly one solution. You may not use the same element twice.
Your solution must use only constant extra space.
Example 1:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 */
public class TwoSumPRoblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 7, 5 };
		int target = 12;
		List<Integer> res = new ArrayList<>();
		res = findTwoSum(a, target);
		System.out.print(res);
	}

	private static List<Integer> findTwoSum(int[] a, int target) {
		// TODO Auto-generated method stub
		List<Integer> res = new ArrayList<>();
		int start = 0;
		int end = a.length - 1;
		int sum = 0;
		while (start < end) {
			sum = a[start] + a[end];
			if (sum == target) {
				res.add(start + 1);
				res.add(end + 1);
				break;
			} else if (sum < target) {
				start++;
			} else {
				end--;
			}
		}

		return res;
	}

}
