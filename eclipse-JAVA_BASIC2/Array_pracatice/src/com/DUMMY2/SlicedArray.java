package com.DUMMY2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SlicedArray {
//slicing an array using lamda streams method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int startIndex = 5;
		int endIndex = 10+1;
		int []sliced = printSlicedArray(a,startIndex,endIndex);
		System.out.println("sliced Array is ==>"+Arrays.toString(sliced));

	}

private static int[] printSlicedArray(int[] a, int startIndex, int endIndex) {
	// TODO Auto-generated method stub
	
	int [] slicedArray = IntStream.range(startIndex, endIndex).map(i->a[i]).toArray();
	
	return slicedArray;
}



}
