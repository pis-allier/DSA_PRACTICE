package com.jagat.Arrays;

import java.util.Arrays;

public class DuplicateString {

	public static void main(String[] args) {
		String a[] =  {"jagat", "jagat","poriya","IT","cyberSecurity"};
		
		System.out.println("origimnal Sttring array"+Arrays.toString(a));
		
		isDuplicate(a);
		
	}

	public static void isDuplicate(String[] a) {
		boolean isFound = false;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j]) {
					isFound = true;
					System.out.println(a[i]+ " ");
					
				}
			}
		}
	}
}
