package com.DUMMY;

import java.util.Arrays;

public class RotateArrayByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println("original Array " + Arrays.toString(a));
		int rotateBy = 1;
		int b[] = new int[a.length];
		b = rotatedArray(a, rotateBy);
		System.out.println("Roated Array is " + Arrays.toString(b));

	}

	private static int[] rotatedArray(int[] a, int rotateBy) {
		// TODO Auto-generated method stub
		int size = a.length;

		for (int i = 0; i < rotateBy; i++) {
			int last = a[a.length - 1];
			for (int j = size - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}

			a[0] = last;
		}
		return a;

	}

}
