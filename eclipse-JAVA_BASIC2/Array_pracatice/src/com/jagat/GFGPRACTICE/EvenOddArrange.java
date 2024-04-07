
package com.jagat.GFGPRACTICE;

import java.util.Arrays;

//sepate even  numbers and odd numbers :even at begining and odd and end 
public class EvenOddArrange {
	public static void main(String[] args) {
		int[] arr = { 4, 9, 2, 7, 6, 5, 3 };

		System.out.println("Original array: " + Arrays.toString(arr));
		separateEvenOdd(arr);
		System.out.println("Separated array: " + Arrays.toString(arr));
	}

	public static void separateEvenOdd(int[] arr) {
		int evenIndex = 0;
		int oddIndex = arr.length - 1;

		while (evenIndex < oddIndex) {
			// Find the next even number from the beginning
			while (evenIndex < arr.length && arr[evenIndex] % 2 == 0) {
				evenIndex++;
			}

			// Find the next odd number from the end
			while (oddIndex >= 0 && arr[oddIndex] % 2 != 0) {
				oddIndex--;
			}

			// Swap even and odd numbers if found
			if (evenIndex < oddIndex) {
				int temp = arr[evenIndex];
				arr[evenIndex] = arr[oddIndex];
				arr[oddIndex] = temp;
			}
		}
	}
}
