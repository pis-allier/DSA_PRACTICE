package com.DUMMY;

import java.util.Arrays;

public class PrintTheAraySimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,5,6,4,7,8};
		for(int i=0 ;i<a.length;i++) {
			System.out.println("at index==>"+i+ "==>element is==>"+ a[i]);
		}
		System.out.println("just Print the Array" + Arrays.toString(a));

	}

}
