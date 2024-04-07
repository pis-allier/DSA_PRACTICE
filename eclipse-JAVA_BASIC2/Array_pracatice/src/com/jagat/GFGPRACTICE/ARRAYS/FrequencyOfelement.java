package com.jagat.GFGPRACTICE.ARRAYS;

/*
 * Given an array arr[] of size N and two elements x and y,
 *  use counter variables to find which element appears most in the array. 
 *  If both elements have the same frequency, then return the smaller element.
Note:  We need to return the element, not its count.
 */
public class FrequencyOfelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5 };
		int n = arr.length;
		int x = 4, y = 5;
		int freq = findFrequency(arr, n, x, y);
		System.out.println(freq);

	}

	public static int findFrequency(int arr[], int n, int x, int y) {
		  int countX = 0;
		    int countY = 0;

		    for (int i = 0; i < n; i++) {
		        if (arr[i] == x) {
		            countX++;
		        }
		        if (arr[i] == y) {
		            countY++;
		        }
		    }

		    if (countX > countY) {
		        return x;
		    } else if (countY > countX) {
		        return y;
		    } else {
		        return Math.min(x, y);
		    }
		        
		    }
}
