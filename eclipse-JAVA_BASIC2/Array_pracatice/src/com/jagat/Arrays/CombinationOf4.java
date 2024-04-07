package com.jagat.Arrays;

//combo 4 whose sum is equal to target
public class CombinationOf4 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 6, 5, 8, 7 };
		int target = 12;
		boolean is_Sum = checkSum4(a, target);
		System.out.println("is sum of 4=>" + is_Sum);

	}

	public static boolean checkSum4(int a[], int target) {

		for (int i = 0; i < a.length - 3; i++) {
			for (int j = i + 1; j < a.length - 2; j++) {
				for (int k = j + 1; k < a.length - 1; k++) {
					for (int l = k + 1; k < a.length; k++) {
						if (a[i] + a[j] + a[k] + a[l] == target) {
							System.out
									.println(a[i] + "+" + "" + a[j] + "+" + "" + a[k] + "+" + "" + a[l] + "=" + target);
							return true;

						}
					}
				}
			}
		}
		return false;

	}

}
