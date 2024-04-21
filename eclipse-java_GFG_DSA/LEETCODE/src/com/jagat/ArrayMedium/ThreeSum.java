package com.jagat.ArrayMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, 
 * and nums[i] + nums[j] + nums[k] == 0.
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
 * 
 */
public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> list = new ArrayList<>();
		list = threeSum(a);
		list.stream().forEach(System.out::print);
	}

	private static List<List<Integer>> threeSum(int[] a) {
		// TODO Auto-generated method st
		Set<List<Integer>> set = new HashSet<>();
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			int j = i + 1;
			int k = a.length - 1;
			while (j < k) {
				int sum = a[i] + a[j] + a[k];
				if (sum == 0) {
					set.add(Arrays.asList(a[i], a[j], a[k]));
					j++;
					k--;
				} else if (sum > 0) {
					k--;
				} else {
					j++;
				}
			}
		}
		res.addAll(set);
		return res;
	}

}
