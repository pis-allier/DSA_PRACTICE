package com.jagat.GFGPRACTICE.ARRAYS;

public class SecondLargestElementArray {

	public static void main(String[] args) {
	
		int arr[]  = {10,10,10};
		int secondLargest = findSecondLargest(arr);
		System.out.println("second LArgest==>"+secondLargest);

	}
	public static int findSecondLargest(int arr[]) {
		
		int i, first= Integer.MIN_VALUE, second=Integer.MIN_VALUE;
		for(i=0; i<arr.length;i++) {
			if(arr[i]  > first ) {
				second = first;
				first = arr[i];
			}else if(arr[i] >second && arr[i] != first) {
				second = arr[i];
			}
		}
		return second;
	}
	

}
