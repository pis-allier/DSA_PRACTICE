package com.DSA.TWO_POINTERS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
 */
public class ThreeSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> res = new ArrayList<>();
		res = findUniqueThreeSum(nums);
		System.out.print(res);
	}

	private static List<List<Integer>> findUniqueThreeSum(int[] nums) {
		// TODO Auto-generated method stub
		Set<List<Integer>> s = new HashSet<>();
		List<List<Integer>> res = new ArrayList<>();
		

		Arrays.sort(nums);
		// fix the 1st ele and find other 2 ele
		for (int i = 0; i < nums.length; i++) {
			// find other 2 ele using 2-sum approach
			int j = i + 1;
			int k = nums.length - 1;

			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == 0) { // add to the set and move
					s.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					k--;
				} else if (sum > 0) {
					k--;
				} else {
					j++;
				}
			}
		}
		res.addAll(s);
		return res;

	}

}
