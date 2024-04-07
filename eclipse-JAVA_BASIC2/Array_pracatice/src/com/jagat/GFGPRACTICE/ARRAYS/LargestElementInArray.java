package com.jagat.GFGPRACTICE.ARRAYS;

public class LargestElementInArray {

	public static void main(String[] args) {
	
		int arr[] = {1,22222,3,450000000,5,6,7,10,455,26};
		int result = findLargest(arr);
		System.out.println("largest element in the array==>"+result);
	}
public static int findLargest(int arr[]) {
	int max = arr[0];
	for(int i=1; i<arr.length-1; i++) {
		if(arr[i] > max)
			max = arr[i];
	}
	return max;
}
}
