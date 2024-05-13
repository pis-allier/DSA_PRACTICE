package com.DSA.TWO_POINTERS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * The pair sum of a pair (a,b) is equal to a + b. The maximum pair sum is the largest pair sum in a list of pairs.
For example, if we have pairs (1,5), (2,3), and (4,4), the maximum pair sum would be max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8.
Given an array nums of even length n, pair up the elements of nums into n / 2 pairs such that:
Each element of nums is in exactly one pair, and
The maximum pair sum is minimized.
Return the minimized maximum pair sum after optimally pairing up the elements.
Example 1:
Input: nums = [3,5,2,3]
Output: 7
Explanation: The elements can be paired up into pairs (3,3) and (5,2).
The maximum pair sum is max(3+3, 5+2) = max(6, 7) = 7.
 */
public class MinimizePairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = Arrays.asList(3, 5, 4, 2, 4, 6);
		int res = maxPAirSum(nums);
		System.out.print(res);

	}

	private static int maxPAirSum(List<Integer> nums) {
		// TODO Auto-generated method stub
		Collections.sort(nums);
        int l = 0;
        int r = nums.size() - 1;
        int[] pairsSum = new int[nums.size() / 2]; // Creating an array to store the pair sums
        int index = 0;
        while (l < r) {
            pairsSum[index++] = nums.get(l) + nums.get(r);
            l++;
            r--;
        }
        Arrays.sort(pairsSum); // Sort the array of pair sums
        return pairsSum[pairsSum.length - 1]; // Return the maximum pair sum
	}

}
