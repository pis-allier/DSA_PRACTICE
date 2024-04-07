package com.jagat.GFGPRACTICE.ARRAYS;

public class MaximumSumSubArray {
//maximum sum subarray using kadanes algorithm
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3};
		int sum =subArrayMax(arr);
      System.out.println(sum);
	}
	public static int  subArrayMax(int arr[]) {
		int res= arr[0];
		int max_end = arr[0];
		for(int i=1; i<arr.length;i++) {
			
			max_end = Math.max(max_end+ arr[i], arr[i]);
			res = Math.max( max_end,res);
		}
		return res;
	}

}
