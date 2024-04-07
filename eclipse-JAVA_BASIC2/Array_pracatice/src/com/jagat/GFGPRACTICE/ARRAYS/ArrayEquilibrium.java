package com.jagat.GFGPRACTICE.ARRAYS;

public class ArrayEquilibrium {
// array equilibrium question
	public static void main(String[] args) {

  int arr[] = {-7, 1, 5, 2, -4, 3, 0};
  int equiliIndex = findEqui(arr);
  System.out.println("index at equilibrium is ===>"+equiliIndex);
  
	}

	public static int findEqui(int arr[]) {
		
		int low = 0;
		int high = arr.length-1;
		int mid = low + (high-low)/2;
		int startSum =0;
		int endSum=0;
		for(int i=0; i<mid; i++) {
			startSum+=arr[i];
		
			for(int j=high; j<mid;j--) {
				endSum+= arr[j];
			}
			if(startSum == endSum) {
				return mid;
			}
			
		}
		return mid;
	}
}
