package com.jagat.LEETCODE;

public class FindPeakElement {
//A peak element is an element that is strictly greater than its neighbors.
	public static void main(String[] args) {
		int a[] = {1,2,3,1};
		int res= findPeak(a);
		System.out.println("peak elemnet index  ==>"+res);

	}
	
	public static int findPeak(int a[]) {
		
		 int low=0;
	        int high = a.length-1;
	      while(low<high){
	          int mid = low+ (high-low)/2;
	          if(a[mid] > a[mid+1]){
	              high = mid;
	          }else{
	              low = mid+1;
	          }
	      }  
	      return low;   
	}

}
