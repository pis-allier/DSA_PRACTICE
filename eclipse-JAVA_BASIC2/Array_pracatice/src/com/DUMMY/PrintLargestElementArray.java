package com.DUMMY;

public class PrintLargestElementArray {

	public static void main(String[] args) {
		int a[] = {1,2,5,4,8,9,666};
		int largest = largestElement(a);
		System.out.println("largest element in array "+largest);

	}

	private static int largestElement(int[] a) {
		// TODO Auto-generated method stub
		try {
			if(a.length == 0) {
				System.out.println("empty array");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		int s = a.length;
		int largest = a[0];
		for(int i = 1; i<s; i++) {
			if(a[i] > largest) {
				largest = a[i];
			}
		}
		
		
		
		return largest;
	}

}
