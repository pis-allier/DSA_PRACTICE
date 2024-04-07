package com.jagat.GFGPRACTICE;

import java.util.Arrays;

public class SecondSmallestArray {

	public static void main(String[] args) {
	int a[] = {10,55,47,15,9,25,21,48};
	
  System.out.println("original array=>"+Arrays.toString(a));
  
  Arrays.sort(a);
  System.out.println("sorted array=>"+Arrays.toString(a));
  
  int n = a.length;
  for(int i=0;i<n;) {
	  System.out.println("second smallest=>"+a[i+1]);
	  break;
  }

	}

}
