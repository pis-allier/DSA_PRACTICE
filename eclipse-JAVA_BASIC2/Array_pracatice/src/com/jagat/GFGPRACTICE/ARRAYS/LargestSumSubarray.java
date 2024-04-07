package com.jagat.GFGPRACTICE.ARRAYS;

//.largest sum of subarray
//using kadanes algorithm
public class LargestSumSubarray {

	public static void main(String[] args) {
		int arr[] = { -3, 4, -1, -2, 1, 5 };
		int sumSubarray = findSumSubarray(arr);
		System.out.println(sumSubarray);

	}

	public static int findSumSubarray(int arr[]) {

		int sum_soFar = Integer.MIN_VALUE;
		int max_endHere = 0;

		for (int i = 0; i < arr.length; i++) {
			max_endHere += arr[i];
			if (sum_soFar < max_endHere) {
				sum_soFar = max_endHere;
			}
			if (max_endHere < 0) {
				max_endHere = 0;
			}
		}
		return sum_soFar;
	}
}
