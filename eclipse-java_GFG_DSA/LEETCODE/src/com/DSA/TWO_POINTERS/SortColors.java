package com.DSA.TWO_POINTERS;

/*
 * Given an array nums with n objects colored red, white, or blue, 
 * sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
 * uses three pointer algorithm
 */
public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 0, 2, 1, 1, 0 };
		int[] res = new int[nums.length];
		res = sortColors(nums);
		for (int x : res) {
			System.out.print(x + " ");
		}

	}

	private static int[] sortColors(int[] nums) {
		// TODO Auto-generated method stub
		// just sort the array in ascending order
		int low = 0, mid = 0, high = nums.length - 1;
		while (mid <= high) {
			if (nums[mid] == 0) {
				swap(nums, low, mid);
				low++;
				mid++;
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				swap(nums, mid, high);
				high--;
			}
		}
		return nums;
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
