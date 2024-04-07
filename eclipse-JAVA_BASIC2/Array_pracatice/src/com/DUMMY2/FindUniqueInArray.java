package com.DUMMY2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindUniqueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 }; 
		findUniqueElements(a);

	}

	private static void findUniqueElements(int[] a) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		for(int num : a) {
			list.add(num);
		}
		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}

}
