package com.DSA.TWO_POINTERS;

import java.util.ArrayList;
import java.util.List;

//find all the subsequence of array, it is diifernet form finding subarray
public class FindSubsequenceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 3,5,6,7 };
		List<List<Integer>> subse = findAllSubsequences(a);
		for (List<Integer> x : subse) {
			System.out.println(x);
		}

	}

	private static List<List<Integer>> findAllSubsequences(int[] nums) {
		// TODO Auto-generated method stub
		 List<List<Integer>> subsequences = new ArrayList<>();

	        // Iterate through all possible start and end points of subsequences
	        for (int start = 0; start < nums.length; start++) {
	            for (int end = start; end < nums.length; end++) {
	                // Create a new subsequence from start to end
	                List<Integer> subsequence = new ArrayList<>();
	                for (int i = start; i <= end; i++) {
	                    subsequence.add(nums[i]);
	                }
	                subsequences.add(subsequence);
	            }
	        }

	        return subsequences;

	}

}
