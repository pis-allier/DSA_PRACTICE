package com.jagat.Arrays;
//sum of two consecutive array elements = traget value
public class SumTwoConsecutive {

	public static void main(String[] args) {
		
		int a[]  = {1,2,3,4,5};
		int target  = 50;
		boolean isSum = checkSum(a, target);
		System.out.println("is sum ="+isSum);

	}

	public static boolean checkSum(int a[], int target) {
		for(int i=0; i<=a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+ a[j] == target) {
					return true;
				}
			}
		}
		return false;
	}
}
