package com.DUMMY;

public class PrintDuplicateElementsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,4};
		int duplicate = findDuplicate(a);
		if(duplicate == -1) {
			System.out.println("no duplicate found");
		}else {
			
			System.out.println("duplicate in arrasy is "+ duplicate);
		}

	}

	private static int findDuplicate(int[] a) {
		// TODO Auto-generated method stub
		int s = a.length;
		int dup = 0;
		for(int i=0 ; i<s; i++) {
			for(int j = i+1 ;j<s; j++) {
				if(a[i] == a[j]) {
					dup = a[i];
				}else {
					dup = -1;
				}
				
			}
		}
		
		return dup;
	}

}
