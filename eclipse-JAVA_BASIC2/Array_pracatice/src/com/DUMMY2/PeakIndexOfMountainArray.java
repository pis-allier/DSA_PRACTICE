package com.DUMMY2;

public class PeakIndexOfMountainArray {
//we can use binary serarch or linear search, here using linear search is done
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 6, 9, 11, 45, 40, 20, 1 };
		int peakIndex = findPeakIndex(a);
		System.out.println("peak indx of given array is ===>" + peakIndex);
		if(peakIndex == 0 || peakIndex == -1) {
			System.out.println("no peak index for given array");
		}

	}

	private static int findPeakIndex(int[] a) {
		// TODO Auto-generated method stub
		if (a == null | a.length < 3) {
			return -1;
		}
		int prev = a[0];
		for (int i = 1; i < a.length - 1; i++) {
			if (prev < a[i] && a[i + 1] < a[i]) {
				return i;
			}
		}

		return 0;
	}

}
