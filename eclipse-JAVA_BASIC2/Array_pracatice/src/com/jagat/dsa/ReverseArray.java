package com.jagat.dsa;

import java.util.Arrays;

//reverse the array
public class ReverseArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		reverseArray(a);

	}

	public static void reverseArray(int a[]) {
		int start=0;
		int end = a.length-1;
		while(start< end) {
			int temp = a[start];
			a[start]  =a[end];
			a[end] = temp;
			
			start++;
			end--;
		}
		System.out.println(Arrays.toString(a));
	}
}
