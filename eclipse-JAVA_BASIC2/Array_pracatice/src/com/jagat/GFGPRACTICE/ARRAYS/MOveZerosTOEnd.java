package com.jagat.GFGPRACTICE.ARRAYS;

import java.util.Arrays;

public class MOveZerosTOEnd {

	public static void main(String[] args) {
		
		int arr[] =  {10,0,10,0};
		moveZeros(arr);
	}
	public static void moveZeros(int arr[]) {

int count =0;
for(int i=0;i<arr.length;i++) {
	if( arr[i]!=0) {
		int temp = arr[i];
		arr[i] = arr[count];
		arr[count] = temp;
		count++;
	}
}
	
System.out.println(Arrays.toString(arr));
	}
}
		/*for (int i = 0; i < arr.length; i++) {
		    if (arr[i] == 0) {
		        for (int j = i + 1; j < arr.length; j++) {
		            if (arr[j] != 0) {
		                int temp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = temp;
		               // break; // Exit the inner loop once a non-zero element is found and swapped.
		            }
		        }
		    }
		}

System.out.println(Arrays.toString(arr));
		
} */
/*}*/
