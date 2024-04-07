package com.DUMMY;

import java.util.Arrays;
//copy elements of onew array in another array
public class CopyElementsInatherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		CopyEmelent(a);

	}

	private static void CopyEmelent(int[] a) {
		// TODO Auto-generated method stub
		int res []  = new int[a.length];
		for(int i=0; i<a.length; i++) {
			res[i]  =a[i];
		}
		System.out.println("Array element is for New array =  >"+ Arrays.toString(res));
		
	}

}
