package com.jagat.searchingsorting.GFG;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
	int a[]  = {1,2,3,4};
	reversedArray(a);
	System.out.println("output ois ==>"+Arrays.toString(a));

	}
	
	public static void reversedArray(int a[]) {
		int start=0;
		int end = a.length-1;
		while(start < end) {
			int temp = a[start];
			   a[start] = a[end];
			   a[end] = temp;
			   start++;
			   end--;
		}
		
	}

}
