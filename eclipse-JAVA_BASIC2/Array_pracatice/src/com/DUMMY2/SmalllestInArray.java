package com.DUMMY2;

public class SmalllestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 11, 22, 33, 5, 66, 55 };
		int smallNumb = findSmallest(a);
		System.out.println("smallest number is ==>" + smallNumb);

	}

	private static int findSmallest(int[] a) {
		// TODO Auto-generated method stub
		int size = a.length;
		int smallest = a[0];
		for (int i = 1; i < size; i++) {
			if (a[i] < smallest) {
				smallest = a[i];
			}
		}

		return smallest;
	}

}
