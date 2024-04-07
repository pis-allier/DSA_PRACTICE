package com.jagat.searchingsorting.GFG;
//find the greatest element in an array smaller than or equal to x
public class FloorArray {

	public static void main(String[] args) {
		 int a[] = {1,2,8,10,10,12,19};
         int x= 5;
         int result = floorValue(a,x);
         System.out.println("result is ==>"+result);
	}

	public static int floorValue(int a[],int x) {
		
		int low = 0;
		int high =a.length-1;
		int floor = -1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(a[mid] == x) {
				return a[mid];
			}if(a[mid] < x) {
			   floor = a[mid];
				low = mid+1;
			}else {
				
				high = mid-1;
			}
		}
		return floor;
		
	}
}
