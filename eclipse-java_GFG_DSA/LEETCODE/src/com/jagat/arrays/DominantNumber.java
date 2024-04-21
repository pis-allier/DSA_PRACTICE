package com.jagat.arrays;

/*
 * You are given an integer array nums where the largest integer is unique.
Determine whether the largest element in the array is at least twice as much as every other number in the array.
 If it is, return the index of the largest element, or return -1 otherwise.
Example 1:
Input: nums = [3,6,1,0]
Output: 1
Explanation: 6 is the largest integer.
For every other number in the array x, 6 is at least twice as big as x.
The index of value 6 is 1, so we return 1.
Example 2:
Input: nums = [1,2,3,4]
Output: -1
Explanation: 4 is less than twice the value of 3, so we return -1.
 */
public class DominantNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1,2,3,4 };
		int index = dominatLargestIndex(a);
		System.out.println(index);
	}

	private static int dominatLargestIndex(int[] a) {
		// TODO Auto-generated method stub
		int max = a[0];
	    int index = 0;

	    // Find the index of the largest element
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] > max) {
	            max = a[i];
	            index = i;
	        }
	    }
	    System.out.println("Max value: " + max);
	    System.out.println("Index of max value: " + index);

	    // Check if any element is strictly less than half the value of the maximum element
	    for (int i = 0; i < a.length; i++) {
	        if (i == index) // Skip the maximum element itself
	            continue;
	        System.out.println("Comparing " + a[i] + " with " + max / 2);
	        if (a[i] >  max / 2)  // Check if element is strictly less than half of max
	            return -1;
	    }

	    return index; // No other element is less than half the value of the maximum element
	}
}
