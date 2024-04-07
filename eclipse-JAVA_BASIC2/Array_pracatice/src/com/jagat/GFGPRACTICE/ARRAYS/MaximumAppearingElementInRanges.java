package com.jagat.GFGPRACTICE.ARRAYS;
/*
 * 
 * 
 * Our Task: Given two arrays L[ ] and R[ ] of size N where L[i] and 
 * R[i] (0 ≤ L[i], R[i] < 106) denotes a range of numbers, 
 * the task is to find the maximum occurred integer in all the ranges. If more than one such integer exists, print the smallest one. 
 * 
 * Input: L[ ] = {1, 4, 3, 1}, R[ ] = {15, 8, 5, 4}
Output: 4
Explanation: Overall ranges are: {1,2,3,4,5,6,7,8,9,10,11,12,13,14 15}, {4,5,6,7,8}, {3,4,5}, {1,2,3,4}. 
In all these ranges, 4 appears the most times.
 */

public class MaximumAppearingElementInRanges {

	public static void main(String[] args) {

		int[] L = { 1, 5, 9, 13, 21 };
		int[] R = { 15, 8, 12, 20, 30 };
		int n = L.length;
		int freq = findFreq(L, R, n);
		System.out.println(freq);

	}

	public static int findFreq(int L[], int R[], int n) {
		
		int fre[] = new int[100];
		for( int i=0; i<n ;i++) {
			for( int j= L[i] ;j< R[i]; j++) {
				fre[j]++;
			}
		}
		int res = 0;
		for (int i = 0; i < 100; i++) {
            if (fre[i] > fre[res])
                res = i;
        }
        return res;
    }
	}

