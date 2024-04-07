package com.jagat.Arrays;

import java.util.HashSet;

public class CommonIntegerArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {2,5,3,4,8};
	   
		isCommon(a,b);
		

	}
	
	public static void isCommon(int[ ]a, int[] b) {

		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<a.length;i++) {
			 for(int j=0;j<b.length;j++) {
				    if(a[i]==b[j]) {
				    	set.add(a[i]);
				    }
			 }
		}
		
		System.out.println("common elements are ==>"+set);
}
}
