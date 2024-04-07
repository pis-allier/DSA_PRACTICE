package com.jagat.GFGPRACTICE;

import java.util.Arrays;

//remove specific element from an arrays
public class RemoveElement {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int x = 2;
		
		System.out.println("original arays==>"+Arrays.toString(a));
		System.out.println("after removing eleemet=>"+isRemove(a,x));
		System.out.println(Arrays.toString(a));
 
	}

	public static int[] isRemove(int a[], int x) {
		for(int i=x; i<=a.length-1;i++) {
			if(a[i] == x) {
				a[i] = a[i+1];
				
			}
			
		}
		System.out.println(Arrays.toString(a));
		return a;
	}
}
