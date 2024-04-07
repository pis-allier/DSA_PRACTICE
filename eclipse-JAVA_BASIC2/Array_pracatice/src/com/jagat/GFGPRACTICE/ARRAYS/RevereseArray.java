package com.jagat.GFGPRACTICE.ARRAYS;

import java.util.Arrays;

public class RevereseArray {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		reverseArray(arr);
		
	}

	public static void reverseArray(int arr[]) {
		
		int left = 0;
		int right = arr.length-1;
		while(left <=right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right]= temp;
			left++;
			right--;
			
		}
		System.out.println("reversded array is ==>"+Arrays.toString(arr));
	}
}
