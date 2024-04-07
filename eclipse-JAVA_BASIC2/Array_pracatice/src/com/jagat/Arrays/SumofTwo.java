package com.jagat.Arrays;

import java.util.Arrays;

//print all elements whos sum is equal to target
public class SumofTwo {

	public static void main(String[] args) {
		int a[] = {2,7,4,-5,11,5,20};
		int target = 15;
		System.out.println("array=>"+Arrays.toString(a)+" "+"target is "+target);
		boolean result = sumTarget(a,target);
		System.out.println(result);
		

	}
public static boolean sumTarget(int a[], int  target) {
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length-1;j++) {
			if(a[i]+a[j]== target) {
				System.out.println("["+a[i]+" + "+a[j]+"]"+ "="+ target);
				return true;
			}
		}
		
			
	}
	return false;
}
}
