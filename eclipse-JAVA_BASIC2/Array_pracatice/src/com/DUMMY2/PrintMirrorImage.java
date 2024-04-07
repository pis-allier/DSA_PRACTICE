package com.DUMMY2;

import java.util.Scanner;

//print the mirror image of 2D array
public class PrintMirrorImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("enter rows");
		int m = in.nextInt();
		System.out.print("enter the column");
		int n = in.nextInt();
		int array[][] = new int[m][n];
		int newArray[][] = new int[m][n];
		System.out.print("enter array elements");
		for(int i=0 ;i<m; i++) {
			System.out.print("enter row elements"+(i+1)+ ":");
			for(int j=0; j<n; j++) {
				array[i][j] = in.nextInt();
			}
		}
		//print the input array
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		//swapping matrix elements for mirror image
		for(int i=0; i<n;i++) {
			for(int j=0; j<m; j++) {
				newArray[i][n-1-j] = array[i][j];
			}
		}
		//printing the mirrior image of array
		for(int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
				System.out.print(newArray[i][j]+ "\t");
			}
			System.out.println();
		}

	}

}
