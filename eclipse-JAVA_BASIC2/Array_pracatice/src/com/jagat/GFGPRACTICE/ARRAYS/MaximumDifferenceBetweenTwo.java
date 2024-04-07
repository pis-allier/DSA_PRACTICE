package com.jagat.GFGPRACTICE.ARRAYS;

public class MaximumDifferenceBetweenTwo {
//max diffreence between a[j] - a[i] such thast j> i
	public static void main(String[] args) {
		int arr[] = {7,9,5,6,3,2};
		int diff = maxDiff(arr);
		System.out.println("mx difference is =>"+diff);

	}

	public static int maxDiff(int arr[]) {
		
		int maxDifference = Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			for(int j= i+1;j<arr.length;j++) {
				int diff = arr[j] - arr[i];
				if(diff > maxDifference)
					maxDifference = diff;
			}
		}
		return maxDifference;
		
	}
	
	
	/* effficent arrparoch   
	 * 
	 * 
	 * int res = arr[1] - ar[0]
	 * int minValu = arr[0];
	 * for(int i=1; i<arr.length;i++)
	 * {
	 * 
	 *   res = Math.Max(res, arr[i] - minValu);
	 *   minValu = Math.min(minvalu , arr[i]);
	 *  }
	 *  return res;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
}
