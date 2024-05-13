package com.DSA.TWO_POINTERS;

public class SquareOfTwoNumbersEqualsTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1000000;
		boolean isNumber = findSquareEqualsTarget(a);
		if (isNumber) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}
	}

	private static boolean findSquareEqualsTarget(int a) {
		// TODO Auto-generated method stub
		long squarSum = 0;
		int start = 1;
		long end = (long) Math.sqrt(a);
		while (start <= end) {
			squarSum = start * start + end * end;
			if (squarSum == a) {
				return true;
			} else if (squarSum < a) {
				start++;
			} else {
				end--;
			}

		}
		return false;
	}

}
