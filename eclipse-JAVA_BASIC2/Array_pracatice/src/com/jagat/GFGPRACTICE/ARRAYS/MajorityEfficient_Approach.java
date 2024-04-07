package com.jagat.GFGPRACTICE.ARRAYS;

public class MajorityEfficient_Approach {

	public static void main(String[] args) {

    int arr[] = {3, 4, 3, 2, 4, 4, 4, 4};
    printMajority(arr);

	}

	public static void printMajority(int arr[]) {
		int cad = findMajority(arr);
		
		if (isMajority(arr ,cad))
			System.out.println(" " + cad + " ");
		else
			System.out.println("No Majority Element");
		
	}
	
	public static int findMajority(int arr[]) {
		
		int maj_index=0;
		int count = 1;
		for(int i=0; i<arr.length;i++) {
			if(arr[maj_index] == arr[i]) {
				count++;
			}else {
				count--;
			}if(count == 0 ) {
				maj_index = i;
				count = 1;
				
			}
		}
		return arr[maj_index];
	}
	
	public static boolean isMajority(int arr[], int cad) {
		int i, count = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == cad)
				count++;
		}
		if (count > arr.length / 2)
			return true;
		else
			return false;
	}
}
