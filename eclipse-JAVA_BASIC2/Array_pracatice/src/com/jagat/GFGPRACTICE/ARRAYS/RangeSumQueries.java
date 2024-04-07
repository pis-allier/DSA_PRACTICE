package com.jagat.GFGPRACTICE.ARRAYS;

public class RangeSumQueries {

	/*
	 * To find the sum of elements in a given range of indices [l, r] efficiently,
	 * you can use the concept of a prefix sum array (also known as a cumulative sum
	 * array). Here's how you can implement it:
	 * 
	 * First, create a prefix sum array, where each element at index i will store
	 * the sum of elements from index 0 to i in the original array.
	 * 
	 * Once you have the prefix sum array, you can easily calculate the sum of
	 * elements between any two indices l and r by subtracting the prefix sum at
	 * index l-1 (if l is not 0) from the prefix sum at index r.
	 */
	public static void main(String[] args) {
	
		

	}

}
