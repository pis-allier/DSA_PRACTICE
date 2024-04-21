package com.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

//is String subsequence.
/*
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that 
is formed from the original string by deleting some (can be none) of the characters without 
disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
 */
public class CheckSunsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abc";
		String t = "ahbgdc";

		boolean isSubssequence = findSubsequenceString(s, t);
		System.out.println(isSubssequence);

	}

	private static boolean findSubsequenceString(String s, String t) {

		// TODO Auto-generated method stub

		int sIndex = 0;
		int tIndex = 0;
		while (sIndex < s.length() && tIndex < t.length()) {

			if (s.charAt(sIndex) == t.charAt(tIndex)) {
				sIndex++;
				tIndex++;
			} else {
				tIndex++;
			}

		}
		return sIndex == s.length();

	}

}
