package com.jagat.GFGPRACTICE.ARRAYS;

import java.util.Arrays;

public class ArrayWavesArrangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,7,8,9,10};
		convertWave(arr);
		System.out.println((Arrays.toString(arr)));
		

	}
	//2 1 4 3 5

	public static void convertWave(int arr[]) {
		  int n = arr.length;

		    if (n % 2 != 0) {
		        // To ensure that the loop doesn't go out of bounds, we need to iterate only to n - 1
		        for (int i = 0; i < n - 1; i += 2) {
		            // Swap adjacent elements to create the wave pattern
		            int temp = arr[i];
		            arr[i] = arr[i + 1];
		            arr[i + 1] = temp;
		        }
	}else {
		
		for(int j=0;j<n ;j+=2) {
			 int temp = arr[j];
	            arr[j] = arr[j + 1];
	            arr[j + 1] = temp;
		}
	}
}
}
