package com.DUMMY2;

public class CopyOneArrayInAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("originala array======> " + a.toString());
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}

	}

}
