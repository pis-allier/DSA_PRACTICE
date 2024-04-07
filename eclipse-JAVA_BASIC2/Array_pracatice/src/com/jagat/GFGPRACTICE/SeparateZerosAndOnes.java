package com.jagat.GFGPRACTICE;

import java.util.Arrays;

//separate zeros and ones
public class SeparateZerosAndOnes {

	public static void main(String[] args) {
		int a[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
		int count = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] == 0) {
				count++;
			}
		}
		
		for(int i=0; i<a.length;i++) {
			if(i < count) {
			    a[i] = 0;
			}else {
				a[i] = 1;
			}
		}
		
		System.out.println("arrays spareate ==>"+Arrays.toString(a));
}
	
}	
