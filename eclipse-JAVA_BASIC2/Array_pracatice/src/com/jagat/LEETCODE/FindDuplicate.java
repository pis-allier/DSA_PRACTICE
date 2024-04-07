package com.jagat.LEETCODE;

import java.util.HashSet;

public class FindDuplicate {

	public static void main(String[] args) {
		int a[] = {3,1,3,4,2};
		int duplicate = findDuplicate(a);
		System.out.println("duplicate in array is ==>"+duplicate);

	}
	
	//using hashset approach
public static int findDuplicate(int a[]) {

	HashSet<Integer> set = new HashSet<>();
	  for(int num : a) {
		  if(set.contains(num)) {
			  return num;
		  }
		  set.add(num);
	  }
	  return -1;
}
}