package com.DUMMY;

import java.util.Arrays;

public class IrregularArrayUsingLamda {

	// create irregular array using lamda
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6, 44, 556 }, { 7, 8, 9, 10 }, { 11, 22, 88, 99, 66, 66, 66, 99, 88, 77 } };

		// looping through each row of the jaagged array using streams
		Arrays.stream(a).forEach(row -> {
			// loop through each element of the current row
			Arrays.stream(row).forEach(elemnet -> System.out.print(elemnet + ""));

			System.out.println();
		});

	}

}
