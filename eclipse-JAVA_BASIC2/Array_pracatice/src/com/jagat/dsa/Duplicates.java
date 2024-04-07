package com.jagat.dsa;

import java.util.HashSet;

//return true or false if duplicates respectievly
//alternativel use hashset for easy time complexcity
public class Duplicates {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 6, 6, 6, 6 };
		boolean is_duplicate = foundDuplicate(a);
		if (is_duplicate) {

			System.out.println(is_duplicate + "duplicates found");
		} else {
			System.out.println(is_duplicate + " " + "no duplicates found");
		}
	}

	public static boolean foundDuplicate(int a[]) {
		HashSet<Integer> set = new HashSet<>();
		int count = 0;

		for (int value : a) {
			if (set.contains(value)) {
				count++;
			}
			set.add(value);
		}

		if (count > 0) {
			return true;
		}

		return false;
	}

}