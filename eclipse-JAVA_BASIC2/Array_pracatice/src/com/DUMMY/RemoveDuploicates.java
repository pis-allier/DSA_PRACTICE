package com.DUMMY;

import java.util.Arrays;

public class RemoveDuploicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,1,2,5,5,4};
		int uniqueCount = removeDup(a);
		int[] uniqueArray = Arrays.copyOf(a, uniqueCount);
		System.out.println(Arrays.toString(uniqueArray));
		
	}

	private static int removeDup(int[] a) {
		// TODO Auto-generated method stub
		
		Arrays.sort(a);
		int count = 1;
		for(int i=1 ; i<a.length;i++) {
			if(a[i] != a[i-1]) {
				a[count++] = a[i];
			}
		}
		return count;
	}

	
}
