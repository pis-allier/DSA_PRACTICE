package com.jagat.GFGPRACTICE;

import java.util.Arrays;

// find diif between largest and smallest element of the array
public class LargestAndSamllestArrayInt {

	public static void main(String[] args) {
		int a[] = { 25, 2, 3, 4, 5, 15 };
		System.out.println("original array=>" + Arrays.toString(a));

		int diif = diffInLArgeandSmall(a);
		System.out.println("diff is ==>" + diif);

	}

	public static int diffInLArgeandSmall(int a[]) {
		int max_num = a[0];
		int min_num = a[0];
		

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max_num ) {
				max_num = a[i];
			} else if (a[i] < min_num) {
				min_num = a[i];
			}

		}
		int diff = max_num - min_num;
		return diff;
	}
}
