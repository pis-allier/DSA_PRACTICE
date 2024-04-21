package com.jagat.arrays;

//next greater element in the array
/*The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. 
If there is no next greater element, then the answer for this query is -1.
Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
Example 1:
Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
 * 
 */
public class NextGreaterElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 4, 1, 2 };
		int[] nums2 = { 1, 3, 4, 2 };
		int res[] = new int[nums1.length];
		res = findNextGreaterElement(nums1, nums2);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}

	}

	private static int[] findNextGreaterElement(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		int[] ans = new int[nums1.length];

		for(int i = 0; i < nums1.length; i++) {
			int greaterIdx = -1, j = nums2.length - 1;
			while(j >= 0 && nums2[j] != nums1[i]) {
				if(nums2[j] > nums1[i]){
					greaterIdx = nums2[j];
				}
				j--;
			}
			ans[i] = greaterIdx;
		}

		return ans;

}
}
