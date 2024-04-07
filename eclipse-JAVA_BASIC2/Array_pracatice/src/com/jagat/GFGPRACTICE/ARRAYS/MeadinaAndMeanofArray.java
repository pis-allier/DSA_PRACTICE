package com.jagat.GFGPRACTICE.ARRAYS;

import java.util.Arrays;

public class MeadinaAndMeanofArray {

	public static void main(String[] args) {

    int arr []  = {1, 2, 19, 5};
int mean = findMean(arr);//average of all array elements;
System.out.println("mean of array is  = "+mean);
int median = findMedian(arr);
System.out.println("median of array is "+median);
 

	}
	
	public static int findMean(int arr[]) {
		int n = arr.length;
		int sum = Arrays.stream(arr).sum();
		int mean = sum / n;
		return mean;
	}

	public static int  findMedian(int arr[]) {
		Arrays.sort(arr);
		int median =0;
		int left = 0;
		int right = arr.length-1;
		System.out.println(Arrays.toString(arr));
		
		if(arr.length %2 == 1) {
			median = (left + (right - left))/2;
              return arr[median];			
		}else {
			 int middle1 = arr[arr.length / 2 - 1];
		        int middle2 = arr[arr.length / 2];
		        return (middle1 + middle2) / 2;
		}
		
	    
	    
	    	

	} 
}
