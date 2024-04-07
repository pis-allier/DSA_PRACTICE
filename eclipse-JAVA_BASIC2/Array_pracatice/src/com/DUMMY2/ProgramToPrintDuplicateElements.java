package com.DUMMY2;

import java.util.ArrayList;
import java.util.List;

public class ProgramToPrintDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,4,2,7,7,1,2,3,6,5,8,7,4,5,9,8,7,4};
		List<Integer> getallDupl = new ArrayList<>();
		getallDupl = findDuplicates(a);
		System.out.println("find duplicates====>"+getallDupl);

	}

	private static List<Integer> findDuplicates(int[] a) {
		// TODO Auto-generated method stub
		List<Integer> dupl = new ArrayList<>();
	 int size = a.length;
	 for(int i=0; i<size; i++) {
		 for(int j=i+1; j<size; j++) {
			 if(a[i] == a[j]) {
				 dupl.add(a[i]);
			 }
		 }
	 }
		
		
		
		
		return dupl;
	}

}
