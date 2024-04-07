package com.jagat.GFGPRACTICE.ARRAYS;

public class MaxSumCircularSubarry {
//circular subarray ==> naive solution 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] ={8, -8, 9, -9, 10, -11, 12};
		int res = maxCircular(arr);
		System.out.println(res);
	}

	public static int maxCircular(int arr[]) {
		
		int res = arr[0];
		for(int i=0; i<arr.length;i++) {
			
			int curr_max = arr[i];
			int curr_sum  = arr[i];
			for(int j=1; j<arr.length;j++) {
				
				int index = (i+j)% arr.length;
				curr_sum += arr[index];
				curr_max = Math.max(curr_max, curr_sum);
				
				
			}
			
			res = Math.max(res, curr_max);
		}
		return res;
		
	}
}
