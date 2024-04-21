package com.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a string s which consists of lowercase or uppercase letters, 
 * return the length of the longest palindrome that can be built with those letters.
Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
Example 1:
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
 */
public class LongestPAlindrome {

	public static void main(String[] args) {
		String s = "abccccdd";
		int length = longestPalindrome(s);
		System.out.println(length);
	}

	private static int longestPalindrome(String s) {
		// TODO Auto-generated method stub
		if (s.length() == 1)
			return 1;
		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		int res = 0;
		int odd = 0;
		for (int val : map.values()) {
			if (val % 2 == 0) {
				res += val;
			} else {
				odd++;
				res += val - 1;
			}
		}
		return odd > 0 ? res + 1 : res;

	}

}
