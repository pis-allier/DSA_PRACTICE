package com.jagat.LEETCODE;

import java.util.Arrays;
import java.util.Collections;

public class ArrayPermute {

	public static void main(String[] args) {
		Integer a[] = {2, 1, 3};
		Integer b[]= {7, 8, 9};
		int k = 10;
		
		boolean res = permuteArray(a,b,k);
		System.out.println("is permute ==>"+res);
		
	}

	public static boolean permuteArray(Integer a[],Integer b[], Integer k) {
		Arrays.sort(a, Collections.reverseOrder());
		Arrays.sort(b);
		int n = a.length;
		
		for(int i=0; i<n;i++) {
			if(a[i]+ b[i] <k) {
				return false;
			}
			
}
		return true;
}
}