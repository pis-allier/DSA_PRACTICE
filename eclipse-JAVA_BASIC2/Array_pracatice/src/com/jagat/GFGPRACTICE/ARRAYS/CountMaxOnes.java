package com.jagat.GFGPRACTICE.ARRAYS;

public class CountMaxOnes {
//counting maximum consecutive ones 
	public static void main(String[] args) {

		int arr[] = { 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1 };
		int res = countOnes(arr);
		System.out.println("max ones is ==>" + res);
	}

	public static int countOnes(int arr[]) {

		int res = 0;
		int corr = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				corr = 0;
			} else {
				corr++;
				res = Math.max(res, corr);
			}
		}
		return res;
	}
}