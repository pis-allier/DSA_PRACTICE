package com.DUMMY;

public class BautifullArray {
//array is beautifull if follows following condition
//Condition 1: Each element of the array must be greater than or equal to 1 and less than or equal to s, i.e., within 1 to s (size of the array).
//Condition 2: Any repeated entries in the array are not allowed.
//Condition 3: All the elements of the array must not be arranged in ascending order.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 10, 9};

		boolean is_beautiful = findArrayBeauty(a);
		if (is_beautiful) {
			System.out.println("array is beautyfull");
		} else {
			System.out.println("array is not beautifull");
		}

	}

	private static boolean findArrayBeauty(int[] a) {
		// TODO Auto-generated method stub
		int s = a.length;
		for (int i = 0; i < s; i++) {
			if (a[i] >= 1 && a[i] <= s) {
				for (int j = i; j < s; j++) {
					if (a[i] != a[j] && a[i] > a[j]) {
						return true;
					}
				}
			}
		}
		return false;

	}

}
