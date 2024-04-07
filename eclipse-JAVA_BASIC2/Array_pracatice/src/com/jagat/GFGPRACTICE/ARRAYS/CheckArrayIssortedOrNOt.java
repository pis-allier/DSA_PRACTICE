package com.jagat.GFGPRACTICE.ARRAYS;

public class CheckArrayIssortedOrNOt {

	public static void main(String[] args) {
	int arr[] = {125,100,80,5,10,9,10,125};
	boolean is_sorted = check_sorted(arr);
	System.out.println("result is "+is_sorted);

	}
	
	public static boolean check_sorted(int arr[]) {
		
		int left = 0;
		int right = arr.length-1;
		while(left <right) {
			if(arr[left]  > arr[right] ) {
				return false;
			}else {
				if(arr[left]== arr[right]) {
					 left++;
				        right--;
					
				}
			}
		}
		return true;
	}

}
