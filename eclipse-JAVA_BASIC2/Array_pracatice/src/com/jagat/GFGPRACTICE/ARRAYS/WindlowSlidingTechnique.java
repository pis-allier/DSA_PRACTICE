package com.jagat.GFGPRACTICE.ARRAYS;

//window sliding technique to find max sum of sub array
public class WindlowSlidingTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int k = 4;
		int maxSum = slidingWindowTech(arr, k);
        System.out.println(maxSum);    
	}

	public static int slidingWindowTech(int arr[], int k) {
		{
	        int curr_sum = 0;

	        for (int i = 0; i < k; i++)
	            curr_sum += arr[i];

	        int max_sum = curr_sum;

	        for (int i = k; i < arr.length; i++) {
	            curr_sum += (arr[i] - arr[i - k]);

	            max_sum = Math.max(max_sum, curr_sum);
	        }

	        return max_sum;
	    }
}
}
