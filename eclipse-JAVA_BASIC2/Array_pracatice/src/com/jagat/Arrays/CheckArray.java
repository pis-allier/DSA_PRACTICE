package com.jagat.Arrays;

import java.util.Arrays;

//check if arraya of intergeres without 0 and -1;
public class CheckArray {

	public static void main(String[] args) {
	
		int a[] = {0,2,3,4,5};
		System.out.println("original array==>"+Arrays.toString(a));
		
		boolean check = is_check(a);
		System.out.println("it contains +ve and -ve==>"+ check);
		

	}

	public static boolean is_check(int a[]) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==0 || a[i]== -1) {
				return true;
			}
		}
		return false;
	}
}
