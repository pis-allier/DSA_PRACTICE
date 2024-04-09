package com.leetcode.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//find the common String with least index sum
//find commom Stirng among  it and then find least index 
public class CommonStringWithLeastIndexSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list1 = { "happy", "sad", "good" };
		String[] list2 = { "sad", "happy", "good" };

		List<String> res = new ArrayList<>();
		res = findCommonString(list1, list2);
		if (!res.isEmpty()) {
			res.stream().forEach(System.out::println);
		}
	}

	private static List<String> findCommonString(String[] list1, String[] list2) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < list1.length; i++)
			map.put(list1[i], i);
		List<String> res = new ArrayList<>();
		int min_sum = Integer.MAX_VALUE, sum;
		for (int j = 0; j < list2.length && j <= min_sum; j++) {
			if (map.containsKey(list2[j])) {
				sum = j + map.get(list2[j]);
				if (sum < min_sum) {
					res.clear();
					res.add(list2[j]);
					min_sum = sum;
				} else if (sum == min_sum)
					res.add(list2[j]);
			}
		}

		return res;
	}

}
