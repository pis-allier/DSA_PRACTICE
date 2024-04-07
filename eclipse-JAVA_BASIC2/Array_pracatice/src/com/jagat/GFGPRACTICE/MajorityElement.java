package com.jagat.GFGPRACTICE;

import java.util.Arrays;

//find majority duplicate element in array
public class MajorityElement {

	public static void main(String[] args) {
		int a[] = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
		System.out.println("original array=>" + Arrays.toString(a));

		int result = findMajorityElement(a);
		if (result != -1) {
			System.out.println("majority element is =>" + result);

		} else {
			System.out.println("majority element not found");
		}

	}

	public static int findMajorityElement(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		int count = 1;
		int majorityElement = nums[0];

		for (int i = 1; i < n; i++) {
			if (nums[i] == majorityElement) {
				count++;
			} else {
				count = 1;
				majorityElement = nums[i];
			}

			if (count > n / 2) {
				return majorityElement;
			}
		}

		// No majority element found
		return -1;
	}

}
