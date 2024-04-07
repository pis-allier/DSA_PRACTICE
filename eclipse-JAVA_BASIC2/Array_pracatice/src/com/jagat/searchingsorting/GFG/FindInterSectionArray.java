package com.jagat.searchingsorting.GFG;

import java.util.Arrays;
import java.util.HashSet;

public class FindInterSectionArray {

	public static void main(String[] args) {

   int arr1[]  = {1,2,2,1};
   int arr2[] = {2,2};
   int res[] = new int[arr1.length];
    res = interSection(arr1,arr2);
   System.out.println(Arrays.toString(res));
	}

	public static int[] interSection(int arr1[], int arr2[]) {
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for( int num : arr1) {
			set1.add(num);
		}
		for( int num : arr2) {
			if(set1.contains(num)) {
				set2.add(num);
			}
		}
		
		int res[] = new int[set2.size()];
		int index = 0;
		for( int num: set2) {
			res[index++] = num;
		}
		return res;
	}
}
