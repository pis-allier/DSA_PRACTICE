package com.DUMMY2;

public class PrintElementsAtOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		printOddElements(a);

	}

	private static void printOddElements(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0; i<a.length;i++) {
			if(i %2 != 0) {
				System.out.print(a[i] + ", ");
			}
		}
		System.out.println("<================another appraoch==============>");
		for(int i=0; i<a.length; i+=2) {
			System.out.print(a[i]+ " ,");
		}
	}

}
