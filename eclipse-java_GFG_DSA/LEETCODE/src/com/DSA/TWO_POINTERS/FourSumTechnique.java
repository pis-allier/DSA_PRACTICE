package com.DSA.TWO_POINTERS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.
Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 */
public class FourSumTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1,0,-1,0,-2,2};
		int target = 0;
		List<List<Integer>> res = new ArrayList<>();
		res = findUniqueFourSum(nums, target);
		System.out.print(res);

	}

	private static List<List<Integer>> findUniqueFourSum(int[] nums, int target) {
		// TODO Auto-generated method stub

		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 3; i++) {
			for (int j = i + 1; j < nums.length - 2; j++) {
				long res = (nums[i] + nums[j]);
				long remaining = target - res;

				int left = j + 1;
				int right = nums.length - 1;
				while (left < right) {
					long sum = nums[left] + nums[right];
					if (sum == remaining) {
						ArrayList<Integer> temp = new ArrayList<>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[left]);
						temp.add(nums[right]);
						if (!ans.contains(temp))
							ans.add(temp);
						left++;
						right--;
					} else if (sum < remaining) {
						left++;

					} else if (sum > remaining) {
						right--;
					}

				}
			}

		}
		return ans;
	}

}
