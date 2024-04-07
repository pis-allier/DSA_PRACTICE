package com.jagat.GFGPRACTICE.ARRAYS;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int a[] = { 1, 4, 20, 3, 10, 5 };
		int sum = 3;
		boolean is_sumPresent = sumArraySum(a, sum);
		System.out.println(is_sumPresent);
	}

	public static boolean sumArraySum(int a[], int sum) {

		int Sum = 0;
		int curr = 0;
		for (int i = 0; i < a.length; i++) {
			curr += a[i];
			while (sum < curr) {
				curr -= a[Sum];
				Sum++;
			}
			if (curr == sum) {
				return true;
			}
		}
		return false;

	}
}
