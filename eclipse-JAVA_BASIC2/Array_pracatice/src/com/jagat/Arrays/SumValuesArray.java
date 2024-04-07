package com.jagat.Arrays;

import java.util.Arrays;

//sum of value of the array
public class SumValuesArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3};
		System.out.println("Original array=>"+Arrays.toString(a));
		System.out.println("Sum of values in arrays=>"+sum(a));
		
	}
	
	public static int sum(int [] n) {
		
		int sum=0;
		 
		for(int a : n) {
			
			sum += a;
			
		}
		return sum;
		
	}

}
