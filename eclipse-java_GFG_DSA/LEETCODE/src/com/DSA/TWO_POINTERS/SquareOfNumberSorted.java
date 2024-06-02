package com.DSA.TWO_POINTERS;
/*
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 * 
 */
public class SquareOfNumberSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {-4,-1,0,3,10};
		int [] res = new int[nums.length];
		res = SqauredSorted(nums);
		for(int x : res) {
			System.out.print(x +  " ");
		}
		
		
	}

	private static int[] SqauredSorted(int[] nums) {
		// TODO Auto-generated method stub
		
		int [] res = new int[nums.length];
		int left = 0;
		int right = nums.length-1;
		int index = nums.length-1;
		while(left <= right) {
			int leftE = nums[left] * nums[left];
			int rightE = nums[right] * nums[right];
			if(leftE > rightE) {
				res[index --] = leftE;
				left++;
			}else {
				res[index--] = rightE;
				right--;
			}
		}
		
		return res;
	}

}
