package com.DUMMY2;

public class ThirdLargestInArray {
//arrnage array in ascending order the nreturn thrid largest number 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {11,22,66,88,55,10};
		int thirdLargest = findThirdLargest(a);
		System.out.println("third largest number is======>"+thirdLargest);

	}

	private static int findThirdLargest(int[] a) {
		// TODO Auto-generated method stub
		int size = a.length;
		for(int i=0; i<size; i++) {
			for(int j=i+1 ; j<size; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		
		
		return a[size-3];
	}

}
