package com.jagat.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 * You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. 
 * All the scores are guaranteed to be unique.
The athletes are placed based on their scores, where the 1st place athlete has the highest score, 
the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
The 1st place athlete's rank is "Gold Medal".
The 2nd place athlete's rank is "Silver Medal".
The 3rd place athlete's rank is "Bronze Medal".
For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
Return an array answer of size n where answer[i] is the rank of the ith athlete.
example 1:
Input: score = [5,4,3,2,1]
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
Example 2:

Input: score = [10,3,8,9,4]
Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].
 */
public class RelavtiveRanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { 10,3,8,9,4 };
		String[] res = new String[score.length];
		res = findRelactiveRanks(score);

		 System.out.println(Arrays.toString(res));
		
	}

	private static String[] findRelactiveRanks(int[] score) {
		// TODO Auto-generated method stub
		String[] res = new String[score.length];
		List<Integer> list = new ArrayList<>();
		HashMap<Integer, String> map = new HashMap<>();
		for (int i = 0; i < score.length; i++) {
			list.add(score[i]);
		}
		Collections.sort(list);
		int length = list.size();
		for (int i = length - 1; i >= 0; i--) {
			if (i == length - 1) {
				map.put(list.get(i), "Gold Medal");
				continue;
			} else if (i == length - 2) {
				map.put(list.get(i), "Silver Medal");
				continue;
			} else if (i == length - 3) {
				map.put(list.get(i), "Bronze Medal");
				continue;
			} else {
				map.put(list.get(i), Integer.toString(length - i));
				continue;
			}
		}

		for (int i = 0; i < score.length; i++) {
			res[i] = map.get(score[i]);
			System.out.println(res[i]);
		}
		return res;
	}

}
