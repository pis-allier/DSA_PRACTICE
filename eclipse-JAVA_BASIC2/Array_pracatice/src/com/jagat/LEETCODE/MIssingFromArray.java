package com.jagat.LEETCODE;

import java.util.Arrays;

/*You are given a read only array of n integers from 1 to n.
Each integer appears exactly once except A which appears twice and B which is missing.
Return A and B.
Note: Your algorithm should have a linear runtime complexity. 
Could you implement it without using extra memory?
Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3] 

Output:[3, 4] 

A = 3, B = 4*/
public class MIssingFromArray {

	public static void main(String[] args) {
		int a[] = { 3, 1, 2, 5, 3 };
		missingnRepeatede(a);
	}

	public static void missingnRepeatede(int a[]) {
      
		for(int i=0;i<a.length;i++) {
			for(int j= i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					System.out.println(a[i]+" is repeated number element");
					
				}
			}
		}
		
		int n = a.length;
	       int expec = (n+1) * (n+2)/2;
	       int actualSum = Arrays.stream(a).sum();
	       int miss = expec - actualSum;
	       System.out.println("Missing nunber from array==>"+miss);
		
	}
}
