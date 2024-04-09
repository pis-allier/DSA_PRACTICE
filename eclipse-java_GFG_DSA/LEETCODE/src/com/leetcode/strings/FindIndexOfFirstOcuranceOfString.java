package com.leetcode.strings;

/*
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class FindIndexOfFirstOcuranceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hayStack = "leetcode";
		String needle = "leeto";

		int index = firstOccurance(hayStack, needle);
		System.out.println(index);
	}

	private static int firstOccurance(String hayStack, String needle) {
		// TODO Auto-generated method stub
		int index = -1;

		for (int i = 0; i <= hayStack.length() - needle.length(); i++) {
			if (hayStack.substring(i, i + needle.length()).equals(needle)) {
				index = i;
				break; // Once found, exit the loop
			}
		}

		return index;
	}

}
