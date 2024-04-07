package com.jagat.Arrays;

import java.util.Arrays;

public class IndexOfArray {

	public static void main(String[] args) {
		
 int a [] = {1,2,3,4,5};
 int x = -2;
 System.out.println("original Array==>"+Arrays.toString(a));
 int result = isIndex(a, x);
 System.out.println("index is ==>" +result);
	}

	public static int isIndex(int a[],int x) {
		try {
			
			for(int i=0; i <=a.length; i++) {
				
				if(a[i] == x) {
					
					return i;
					
				}
				
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
		return -1;
		
	}
	
}
