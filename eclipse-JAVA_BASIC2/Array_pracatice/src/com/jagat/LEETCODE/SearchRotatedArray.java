package com.jagat.LEETCODE;

public class SearchRotatedArray {
//searching in roatated aray ,as array is roatated before searching binary search
	public static void main(String[] args) {

		int a[] = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 3;
		int result = binarySearchRoatatedArray(a, target);
		System.out.println(result);

	}

	public static int binarySearchRoatatedArray(int a[] ,int target) {
		
		int low =0;
		int high = a.length-1;
		while(low<=high) {
			int mid = low +(high- low)/2;
			if(a[mid] == target) {
				return mid;
				
			}
			if(a[low] <= a[mid]) {
				if(target >=a[low] && target < a[mid]) {
					high = mid-1;
				}else {
					low = mid+1;
				}
				
			}else {
				if(target >a[mid] && target <=a[high]) {
					low = mid+1;
				}else {
					high = mid-1;
				}
			}
		}
		return -1;
	}
}
