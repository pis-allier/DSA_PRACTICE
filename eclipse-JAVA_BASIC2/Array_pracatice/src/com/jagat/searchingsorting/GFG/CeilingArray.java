package com.jagat.searchingsorting.GFG;

//find an smallest element in an array which is greater than or equal to x
public class CeilingArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 8, 10, 10, 12, 19 };
		int x = 8;
		int ceilResult = is_ceil(a, x);
		System.out.println("ceil of " + x +" is "+ ceilResult);

	}

	public static int is_ceil(int a[],int x) {
		int low=0;
		int high= a.length-1;
		while(low<=high) {
			int mid =low+ ( high-low)/2;
			if(x == a[mid]) {
				return a[ mid];
			}if(x< a[mid]) {
				high = mid-1;
			
			}else {
				low = mid+1;
			}
		}
		return a[low];
}
}
