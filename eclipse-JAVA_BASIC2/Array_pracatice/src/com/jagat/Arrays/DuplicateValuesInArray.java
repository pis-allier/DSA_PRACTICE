package com.jagat.Arrays;
//find duplicate elements in an array
import java.util.Arrays;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
	 int a[] = {1,2,3,3,4,4,5,6,7,8};
	 System.out.println("original array"+Arrays.toString(a));
	 isDuplicate(a);
	}

	public static void isDuplicate(int a[]) {
		boolean isFound = false;
		for(int i=0; i<a.length;i++) {
		for(int j=i+1; j<a.length; j++) {
			if(a[i]== a[j]) {
				isFound= true;
			System.out.print(a[i]+ " ");
			}
		}
				
				
			}
			
		
		
	}
}
