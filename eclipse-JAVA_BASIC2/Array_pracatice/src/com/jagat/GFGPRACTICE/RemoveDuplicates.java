package com.jagat.GFGPRACTICE;

import java.util.Arrays;

//remove duplicates from array and print new length of array
public class RemoveDuplicates {

	public static void main(String[] args) {
		int a[] = { 10, 10, 20, 30, 30, 40 };
		System.out.println("original aray==>" + Arrays.toString(a));
		System.out.println("original length of array==>"+a.length);
       int length = duplicateRemove(a);
       System.out.println("length of array after removing duplicates is =>"+length);
            

	}

	public static int duplicateRemove(int a[]) {
		int index = 1;
		for(int i = 1; i<a.length;i++) {
			if(a[i] != a[index-1]) {
				a[index++] = a[i];
			}
		}
		return index;
	}
}
