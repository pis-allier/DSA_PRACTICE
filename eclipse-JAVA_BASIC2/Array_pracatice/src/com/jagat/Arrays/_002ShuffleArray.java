package com.jagat.Arrays;

import java.util.Arrays;

//shuffle the array-leetcode
public class _002ShuffleArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,4,3,2,1};
		int n = 4;
		
		shuffleArray(a,n);

	}

	public static void shuffleArray(int a[] , int n) {
		 int x[] =  new int [a.length];
		 
		 for(int i=0; i<n;i++) {
			 x[i *2] = a[i];
			 x[i*2 +1] = a[i + n];
		 }
			System.out.println(Arrays.toString(x));
		}
		
	}

