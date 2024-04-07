package com.jagat.Arrays;

import java.util.Arrays;

public class CopyArrayByIterating {

	public static void main(String[] args) {
	int a[] = {1,2,3,4,5};
	int newa[]=  new int[a.length];
	
	for(int i=0; i<a.length;i++) {
		
		 newa[i] = a[i];
		 
	}
	System.out.println("xopied array==>"+Arrays.toString(newa));

	}

}
