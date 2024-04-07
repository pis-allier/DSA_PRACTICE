package com.DUMMY2;

import java.util.Arrays;

//arrange array in zig zag position
public class ZigZagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]  ={2, 4, 5, 1, 7, 6, 8};
	doZigZagArray(a);
	System.out.println(Arrays.toString(a));

	}

	private static void doZigZagArray(int[] a) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int temp;
		for(int i=0; i<a.length-1;i++) {
			if(flag) {
				if(a[i] > a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}else {
				if(a[i] < a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
			if(flag == true) {
				flag = false;
			}else {
				flag = true;
			}
		}
		
		
	}

}
