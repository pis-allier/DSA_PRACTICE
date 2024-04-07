package com.DUMMY;

import java.util.Arrays;

public class LeftRotateArrayByone {
//left rotate array by one 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int leftRotateBy = 1;
		rotateArray(a, leftRotateBy);

	}

private static void rotateArray(int[] a,int leftRotateBy) {
	// TODO Auto-generated method stub
	
	int first = a[0];
	int j;
//int size = a.length;
	for(int i=0 ;i<leftRotateBy;i++) {
		for( j=0 ;j<a.length-1; j++) {
			a[j] = a[j+1];
		}
		a[j] = first; 
	}
	System.out.println(Arrays.toString(a));
	
	
}

}
