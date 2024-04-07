package com.DUMMY2;

import java.util.Arrays;

public class SlicedArrayUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int startIndex =3;
		int endIndex = 6;
		int []sliced = findSlicedArray(a,startIndex,endIndex+1);
		System.out.println("Sliced Array===>"+Arrays.toString(sliced));

	}

	private static int[] findSlicedArray(int[] a, int startIndex, int endIndex) {
		// TODO Auto-generated method stub
		int [] sliced = new int[endIndex - startIndex];
		for(int i=0; i<sliced.length;i++) {
			sliced[i] = a[startIndex + i];
		}
		
		return sliced;
	}

}
