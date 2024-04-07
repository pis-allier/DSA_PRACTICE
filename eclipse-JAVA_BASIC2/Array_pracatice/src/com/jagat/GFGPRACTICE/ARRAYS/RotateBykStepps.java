package com.jagat.GFGPRACTICE.ARRAYS;

import java.util.Arrays;

//rotate the elements by k steps 
public class RotateBykStepps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int k=3;
		leftRotateByk(arr,k);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void leftRotateByk(int arr[] , int k) {
		
		 k = k % arr.length;
		 
		 if (k == 0) { 
			// No rotation needed if d is a multiple of n. 
			 return;
			 }
		 
	        
		reverse(arr,0, k-1);//reverse from 0 to k-1
		reverse(arr,k,arr.length-1);// reverese from k to length-1 of array
		reverse(arr,0,arr.length-1);//reverrese whole arrasy 
		
		//for right rotate 
		// reverse(nums, 0, nums.length - 1);  // Reverse the entire array
		  //  reverse(nums, 0, k - 1);          // Reverse the first k elements
		   // reverse(nums, k, nums.length - 1);
	}
	
	private static void reverse(int arr[], int low, int high) {
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			high--;
			low++;
		}
	}
	

}
