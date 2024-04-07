package com.jagat.GFGPRACTICE;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
	int a[] =  {1,2,3,4,5,6};
	System.out.println("original array==>"+Arrays.toString(a));
	
reversed(a);
System.out.println(Arrays.toString(a));
	
	}

	public static int[] reversed(int a[]) {
		  int start = 0;
		  int end = a.length-1;
		
		while(start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return a;
	}
	
	
}
