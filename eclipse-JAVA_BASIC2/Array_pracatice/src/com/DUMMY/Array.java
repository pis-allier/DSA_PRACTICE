package com.DUMMY;

import java.util.ArrayList;
//find the index of the element
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using normal array
		int a[] = { 5, 10, 225, 30 };
		int size = a.length;
		int x = 255;
		int result = findIndexOfElement(a, size, x);
		System.out.println(result);
		// using array lsit
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		int s = list.size();
		int n = 40;

		int result2 = findIndexInArrayList(list, s, n);
		System.out.println(result2);

	}

	//ArrayList method
	private static int findIndexInArrayList(ArrayList<Integer> list, int s, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < s; i++) {
			if (list.get(i) == n) {
				return i;
			}
		}
		return -1;

	}

	//normal array method
	private static int findIndexOfElement(int[] a, int size, int x) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {

			if (a[i] == x) {
				return i;
			}
		}

		return -1;
	}

}
