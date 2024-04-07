package com.DUMMY2;

import java.util.Arrays;

public class SeocondSmallestIArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[] = {5,4,2,1,0,6,5,20};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	int secSmallest = findSecondSmallest(a);
	System.out.println("second smallest Number is ===>" + secSmallest);

	}

	private static int findSecondSmallest(int[] a) {
		// TODO Auto-generated method stub
		int s = a.length;
		for(int i=0 ;i<s; i++) {
			for(int j=i+1; j<s; j++) {
				
				if(a[i] > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
			
		}
		
		return a[1];
	}

}
