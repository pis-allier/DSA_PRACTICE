package com.jagat.LEETCODE;

import java.util.Arrays;

public class FindFirstLastPosition {

	public static void main(String[] args) {
		int a[] = {5,7,7,8,8,10};
		int target = 8;
		int []res = findPosition(a,target);
		System.out.println("postion==>"+Arrays.toString(res));

	}

	public static int[] findPosition(int a[], int target) {
		int res[] = {-1,-1};
		res[0] = findFirst(a, target);
		res[1] = findLast(a, target);
		return res;
	}
	 private static  int findFirst(int[] nums, int target){
	        int low= 0;
	        int high = nums.length-1;
	        int pos =-1;
	        while(low<=high){
	            int mid= (low+high)/2;
	            if(target == nums[mid]){
	            pos=mid;
	            high = mid-1;

	            }else if(target <nums[mid]){
	                high = mid-1;
	            }else{
	                low= mid +1;
	            }
	        }

	        return pos;
	    }

	    private static int findLast(int [] nums,int target){
	        int low = 0;
	        int high = nums.length-1;
	        int pos =-1;
	        while(low <=high){
	            int mid = (low+high)/2;
	            if(target == nums[mid]){
	                pos = mid;
	                low = mid +1;
	            }else if(target <nums[mid]){
	                high = mid-1;

	            }else{
	                low = mid+1;
	            }
	        }

	        return pos;
	    }
}
