package com.jagat.GFGPRACTICE.ARRAYS;

public class LongestEvenOddSubarry_NAIVEApproach {
// Our Task: Given an array a[ ] of N integers, the task is to find the length of the longest Alternating Even Odd subarray present in the array. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,13,19,5,25,30};
		int res = longestSubarry(arr);
		System.out.println(res);

	}
	
	public  static int longestSubarry(int arr[]) {
		
		int res= 1;
		for(int i=0; i<arr.length;i++) {
			
			int curr = 1;
			for(int j=i+1 ; j<arr.length; j++) {
				if(  (arr[j] % 2 ==0 && arr[j-1]%2 !=0) || (arr[j] %2 !=0 && arr[j-1] %2 == 0) ) {
					curr++;
					
				}else {
					break;
				}
			}
			res = Math.max(res, curr);
		}
		return res;
	}

}
