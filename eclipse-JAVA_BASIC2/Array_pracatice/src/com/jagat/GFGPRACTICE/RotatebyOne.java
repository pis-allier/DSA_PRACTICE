package com.jagat.GFGPRACTICE;

import java.util.Arrays;

//rotate array by one clockwise
public class RotatebyOne {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50};
		System.out.println("original=>"+Arrays.toString(a));
		
		rotate(a, 1);

	}

	public static void rotate(int a[] , int rotate) {
		
		int x = a[a.length-1];
		for(int i=a.length-1; i>0;i--) {
			a[i] = a[i-1];
			
		}
		a[0] = x;
		System.out.println("rotated ==>"+Arrays.toString(a));
	}
}
