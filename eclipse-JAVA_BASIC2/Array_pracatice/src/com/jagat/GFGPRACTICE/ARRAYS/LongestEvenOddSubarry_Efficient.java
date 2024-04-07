package com.jagat.GFGPRACTICE.ARRAYS;

public class LongestEvenOddSubarry_Efficient {
// using kadanes algorithm
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,13,19,5,25,30};
		int res = longestSubarry(arr);
		System.out.println(res);

	}
	
	public static int longestSubarry(int arr[]) {
		
		int res=1;
		int curr = 1;
		for(int i=1 ; i< arr.length;i++) {
			if( (arr[i]%2 ==0 && arr[i-1]%2 !=0) || (arr[i]%2 !=0 && arr[i-1]%2 == 0)) {
				curr++;
				res = Math.max(res, curr);
			}else {
				curr=1;
			}
			
		}
		
		return res;
		
		
	}
	

}
