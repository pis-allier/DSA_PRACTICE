package com.jagat.GFGPRACTICE.ARRAYS;

public class AbsoluteDifferenceBetweenAdjacent {
//thids is circular array 
	public static void main(String[] args) {

    int arr[] = {8,-8,9,-9,10,-11,12};
    int min = diffAb(arr);
    System.out.println(min);
		
	}
	
	public static int diffAb(int arr[]) {
		
		 int n = arr.length;
	        int min = Integer.MAX_VALUE; // Initialize min to a large value

	        for (int i = 0; i < n; i++) {
	            int diff = Math.abs(arr[i] - arr[(i + 1) % n]);// this is circular array henccethis 
	            if (diff < min) {
	                min = diff;
	            }
	        }

	        return min;
	    }

}
