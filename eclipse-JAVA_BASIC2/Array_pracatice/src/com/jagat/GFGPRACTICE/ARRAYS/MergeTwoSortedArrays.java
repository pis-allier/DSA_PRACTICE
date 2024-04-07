package com.jagat.GFGPRACTICE.ARRAYS;
//merge the sorted  array
import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		int arr2[] = {4,5,6};
		mergeSortedArray(arr, arr2);
		

	}

	public static void mergeSortedArray(int arr[], int arr2[]) {
		int arr3[] = new int[arr.length+arr2.length];
		int i=0;
		int j=0;
		int k =0;
		while(i<arr.length && j <arr2.length) {
			if(arr[i] < arr2[j])
				arr3[k++]  = arr[i++];
			else {
				arr3[k++] = arr2[j++];
			}
		}
		while(i < arr.length) {
			arr3[k++] = arr[i++];
		}while(j< arr2.length) {
			arr3[k++]= arr2[j++];
		}
		System.out.println(Arrays.toString(arr3));
		
	}
}
