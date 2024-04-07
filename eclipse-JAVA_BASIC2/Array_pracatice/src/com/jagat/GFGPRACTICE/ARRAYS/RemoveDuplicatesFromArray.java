package com.jagat.GFGPRACTICE.ARRAYS;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int arr[] ={10, 20, 20, 30, 30, 30};
		sortedArray(arr);
		System.out.println("sorted array==>"+Arrays.toString(arr));
        System.out.println("original size==>"+6); 
	}

	public static void sortedArray(int arr[]) {
		
		int newSize = 1;
		for(int i=1; i<arr.length;i++) {
			if(arr[i-1]!= arr[i]) {
				arr[newSize] = arr[i];
				newSize++;
			}
		}
		System.out.println("newSize ==>"+newSize);
	}
}
