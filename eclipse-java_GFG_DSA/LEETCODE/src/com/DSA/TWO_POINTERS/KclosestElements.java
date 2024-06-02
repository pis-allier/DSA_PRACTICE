package com.DSA.TWO_POINTERS;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. 
 * The result should also be sorted in ascending order.
An integer a is closer to x than an integer b if:
|a - x| < |b - x|, or
|a - x| == |b - x| and a < b
Example 1:
Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]
Example 2:
Input: arr = [1,2,3,4,5], k = 4, x = -1
Output: [1,2,3,4]
 * 
 */
public class KclosestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 4;
		int x = 3;
		List<Integer> res = new ArrayList<>();
		res = findKClosest(arr, k, x);
		res.stream().forEach(System.out::print);

	}

	private static List<Integer> findKClosest(int[] arr, int k, int x) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = arr.length - 1;
		while (hi - lo >= k) {
			if (Math.abs(arr[lo] - x) > Math.abs(arr[hi] - x)) {
				lo++;
			} else {
				hi--;
			}
		}
		List<Integer> result = new ArrayList<>(k);
		for (int i = lo; i <= hi; i++) {
			result.add(arr[i]);
		}
		return result;
	}

}
