package com.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
 */
public class NonRepeatingCharReturnIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		int index = findNonRepeating(s);
		System.out.println(index);

	}

	private static int findNonRepeating(String s) {
		// TODO Auto-generated method stub

		Map<Character, Integer> freq = new HashMap<>();
		for (char ch : s.toCharArray()) {
			freq.put(ch, freq.getOrDefault(ch, 0) + 1);

		}

		// Iterate over the string to find the first non-repeating character
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (freq.get(ch) == 1) {
				return i; // Return the index of the first non-repeating character
			}
		}
		return -1; // No non-repeating character found
	}

}
