package com.jagat.LEETCODE.BINARY_SEARCH;

//Given a sorted array of distinct integers and a target value, return the index if the target is found.
//If not, return the index where it would be if it were inserted in order.
public class SearchPosition {

	public static void main(String[] args) {

 int arr[] =  {1,3,5,6};
 int target = 2;
 int res = findTarget(arr, target);
 System.out.println(res);

	}
	
	public static int findTarget(int arr[], int target) {
		int low = 0;
	    int high = arr.length - 1;
	    
	    while (low <= high) {
	        int mid = low + (high - low) / 2;
	        
	        if (arr[mid] == target) {
	            return mid;  // Target found
	        } else if (arr[mid] < target) {
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	    }
	    
	    // If the loop exits, the target is not in the array.
	    // The "low" variable now indicates where the target should be inserted.
	    return low;
	}

}
