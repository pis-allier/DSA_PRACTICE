package com.jagat.Arrays;

import java.util.Arrays;

//given a target find postion of eelement if not found find where to fix
public class BinarySearchapproach {

	public static void main(String[] args) {
		int a[] = {1,3,5,7,9};
		int target = 2;
		System.out.println("original arrray==>"+Arrays.toString(a));
	int positon=	findPosition(a, target);
	System.out.println("position==>"+positon);
		

	}

	public static int findPosition(int a[], int target) {
		int left = 0;
		int right = a.length-1;
		while(left<= right) {
			int mid = left+ (right-left)/2;
			if(a[mid]== target) {
				return mid;
				
			}else if(a[mid] < target) {
				left = mid +1;
				
			}else {
				right = mid-1;
			}
		}
		return left;
	}
}
