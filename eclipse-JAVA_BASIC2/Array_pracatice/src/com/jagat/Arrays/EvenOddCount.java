package com.jagat.Arrays;

import java.util.Arrays;

public class EvenOddCount {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 6, 3, 5, 7, 9, 13 };

		System.out.println("original aarray==>" + Arrays.toString(a));

		int _countEven = count_Even(a);
		int _countOdd = count_Odd(a);
		System.out.println("even integers are=>" + _countEven);
		System.out.println("odd integers are ==>" + _countOdd);

	}
public static int count_Even(int a[]) {
	int count=0;
	for(int i=0; i<a.length;i++) {
		if(a[i] % 2 == 0) {
			count++;
			
		}
	}
	return count;
}
public static int count_Odd(int a[]) {
	int count = 0;
	for(int i=0;i<a.length;i++) {
		if(a[i] % 2 !=0) {
			count++;
		}
	}
	return count;
}
}
