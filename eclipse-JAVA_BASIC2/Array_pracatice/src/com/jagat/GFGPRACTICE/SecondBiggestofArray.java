package com.jagat.GFGPRACTICE;

import java.util.Arrays;

public class SecondBiggestofArray {

	public static void main(String[] args) {
		int a[] =  {0,25,12,88,20,10,99,100};
		System.out.println("original array=>"+Arrays.toString(a));
		
		Arrays.sort(a);
		for(int i=0;i<a.length;) {
			
			System.out.print(a[a.length-2]);
			break;
		}

	}

}
