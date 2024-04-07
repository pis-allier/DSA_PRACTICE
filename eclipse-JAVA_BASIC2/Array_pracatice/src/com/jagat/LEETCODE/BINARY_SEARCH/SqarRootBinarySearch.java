package com.jagat.LEETCODE.BINARY_SEARCH;

public class SqarRootBinarySearch {
//find sqart root using binary search algoirithm
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 24;

		int result = findSqrt(x);
		System.out.println(result);

	}

	/*
	 * public static int findSqrt(int x) {
	 * 
	 * // base case if (x < 2) { return x; }
	 * 
	 * int res = 0; // sqar root can not be greater tha n x/2; for x >1 int start =
	 * 1; int end = x; while(start <= end) { int mid = (start + end) / 2; long sqrt
	 * = mid * mid; // return `mid` if `x` is a perfect square if(sqrt == mid) {
	 * return mid; } // if `mid×mid` is less than `x` else if(sqrt < x) { start =
	 * mid +1; // update result since we need a floor res = mid; } else { // discard
	 * the right search space end = mid - 1; }
	 * 
	 * 
	 * } return res;
	 * 
	 * }
	 */
	public static int findSqrt(int x) {
	    // Base case: If x is less than 2, return x
	    if (x < 2) {
	        return x;
	    }

	    int start = 1;
	    int end = x;
	    int res = 0;

	    while (start <= end) {
	        int mid = start + (end - start) / 2;
	        long square = (long) mid * mid; // Cast mid to long to prevent overflow

	        if (square == x) {
	            return mid; // Found the exact square root
	        } else if (square < x) {
	            start = mid + 1;
	            res = mid; // Update result since we need the floor value
	        } else {
	            end = mid - 1; // Discard the right search space
	        }
	    }

	    return res;
	}
}
