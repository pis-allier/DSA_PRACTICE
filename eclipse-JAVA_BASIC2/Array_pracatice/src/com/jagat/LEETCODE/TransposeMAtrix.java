package com.jagat.LEETCODE;

import java.util.Arrays;

public class TransposeMAtrix {

	public static void main(String[] args) {
		int a[][] = { {1,2,3},
				            {4,5,6},
				            {7,8,9} };
		for(int [] row: a)
		System.out.println(Arrays.toString(row));
		System.out.println("------------------------");
		
		 transpose(a);
		

	}
	
	public static void transpose(int a[][]) {
		int numrow =a.length;
		int numcol = a[0].length;
		int trans[][] = new int[numrow][numcol]; 
		// matrix is no squared then use 	int trans[][] = new int[numCol][numrow]; 
		for(int i=0;i<numrow;i++) {
			for(int j=0;j<numcol;j++) {
				trans[j][i] = a[i][j];
			}
		}
		for(int [] t:trans) {
			System.out.println(Arrays.toString(t));
		}
	}

}
