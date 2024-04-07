package com.jagat.GFGPRACTICE.ARRAYS;

import java.util.Arrays;

public class MaximumOccuredInteger {

	public static void main(String[] args) {

		int L[] = { 2, 1, 3 };
		int R[] = { 5, 3, 9 };
        int range = maxRange(L,R);
		System.out.println(range);
	}

	public static int maxRange(int L[], int R[]) {
		
		 int maxRange = Arrays.stream(R).max().getAsInt();
	        int[] occurrences = new int[maxRange + 2]; // Initialize an array to store occurrences
	        
	        for (int i = 0; i < L.length; i++) {
	            occurrences[L[i]]++; // Increment count for starting integer
	            occurrences[R[i] + 1]--; // Decrement count for the integer after the end point
	        }
	        
	        int maxCount = 0;
	        int maxInteger = 0;
	        int currentCount = 0;
	        
	        for (int i = 1; i < occurrences.length; i++) {
	            currentCount += occurrences[i];
	            if (currentCount > maxCount) {
	                maxCount = currentCount;
	                maxInteger = i;
	            }
	        }
	        
	        return maxInteger;
	    }

	}

