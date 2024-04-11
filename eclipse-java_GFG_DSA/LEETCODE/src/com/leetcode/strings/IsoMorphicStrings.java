package com.leetcode.strings;

import java.util.HashMap;

/*
 * Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. 
No two characters may map to the same character, but a character may map to itself.
Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 */
public class IsoMorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "egg";
		String t = "add";
		boolean isIsomorphic = findIsomorphicString(s, t);
		System.out.println(isIsomorphic);
	}

	private static boolean findIsomorphicString(String s, String t) {
		// TODO Auto-generated method stub
		HashMap<Character, Character> countChar = new HashMap<>();
		char c = 'a';
		for (int i = 0; i < s.length(); i++) {
			if (countChar.containsKey(s.charAt(i))) {
				c = countChar.get(s.charAt(i));
				if (c != t.charAt(i))
					return false;
			} else if (!countChar.containsValue(t.charAt(i))) {
				countChar.put(s.charAt(i), t.charAt(i));
			} else {
				return false;
			}
		}
		return true;

	}

}
