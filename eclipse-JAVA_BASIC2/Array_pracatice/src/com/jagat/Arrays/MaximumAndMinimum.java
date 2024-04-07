package com.jagat.Arrays;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		int 	a[] = {-11,-55,44,77,99,-555,0};
		
		int max = isMax(a);
		int min = isMin(a);
		System.out.println("maximum of array==>"+max);
		System.out.println("minimum of array==>"+min);
		
	}
	
	public static int isMax(int a[]) {
		int max = a[0];
		for(int i=1; i<a.length;i++) {
			if(a[i] > max) {
				 max = a[i];
				
			}
			
		}
		return max;
	}
	public static int isMin(int a[]) {
		
		int min = a[0];
		for(int i=1; i<a.length;i++) {
			if(a[i] < min) {
				
				min = a[i];
			}
		}
		return min;
	}

}
