package com.jagat.LEETCODE.BINARY_SEARCH;

// given a circular array find out how many times array is ratataed
//If we carefully analyze the problem, we can see that the total number of rotations is equal to the total number of elements before 
//the minimum element, or the index of the minimum element
/*
 * We can easily solve this problem in O(log(n)) time by modifying the binary search algorithm. We have already reduced the problem to find out the first element of the sorted sequence. 
 * The first element (Pivot) has one special property (let’s call it the pivot’s property) – both the next and previous element of the pivot element are greater than it. 
 * No other array element will have this property except the pivot element. Since the array is circularly sorted,
If the pivot is the last element, then the first element will be considered its next element.
If the pivot is the first element, then the last element will be considered its previous element.
We know that the middle element always divides the array into two subarrays, and the pivot element can
 lie only in one of these halves. It is worth noticing that at least one of these subarrays will always be sorted. 
 If middle element happens to be the point of rotation (minimum element), then both left and right subarrays are sorted. 
 Still, in any case, one half (subarray) must be sorted, 
 and we will use this property to discard the left half or the right half at each iteration of the binary search. 
 */
public class CircularArrayRoatationCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 8, 9, 10, 2, 5, 6 };
		int rotation = findTotalRotation(arr);
		System.out.println("array is roated "+rotation+ ""+ "times");
	}

	public static int findTotalRotation(int arr[]) {
	    int left = 0;
	    int right = arr.length - 1;
	    
	    while (left <= right) {
	        // If the array is not rotated, return 0
	        if (arr[left] <= arr[right])
	            return left;
	        
	        int mid = left + (right - left) / 2;

            // find the next and previous element of the `mid` element
            // (in a circular manner)
	        int next = (mid + 1) % arr.length;
	        int prev = (mid - 1 + arr.length) % arr.length;
	        // if the `mid` element is less than both its next and previous
            // neighbor, it is the array's minimum element
            
	        
	        // if nums[mid…right] is sorted, and `mid` is not the minimum element,
            // then the pivot element cannot be present in nums[mid…right],
            // discard nums[mid…right] and search in the left half
	        if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
	            return mid;
	        } else if (arr[mid] <= arr[right]) {
	            // The minimum element is in the left subarray
	            right = mid - 1;
	        } else if (arr[mid] >= arr[left]) {
	            // The minimum element is in the right subarray
	            left = mid + 1;
	        }
	    }
	    
	    return -1; // No minimum element found
	}
}
