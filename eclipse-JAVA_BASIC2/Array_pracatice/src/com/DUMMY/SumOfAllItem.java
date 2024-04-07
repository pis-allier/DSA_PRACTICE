package com.DUMMY;

public class SumOfAllItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []  = {1,2,3,4,5};
		int sum = sumOfAll(a);
		System.out.println("sum of all items "+sum);

	}

	private static int sumOfAll(int[] a) {
		int sum=0;
		// TODO Auto-generated method stub
		int size = a.length;
		for(int i=0; i<size; i++) {
		 sum= sum+ a[i];
		}
		
		
		return sum;
	}

}
