package com.DUMMY;

public class MinmumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1,1,1,1,1,1 };
		int minElement = findMinimum(a);
		System.out.println("minimum element is " + minElement);

	}

	private static int findMinimum(int[] a) {
		// TODO Auto-generated method stub

		int size = a.length;
		int min = a[0];
		for (int i = 0; i < size; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;

	}

}
