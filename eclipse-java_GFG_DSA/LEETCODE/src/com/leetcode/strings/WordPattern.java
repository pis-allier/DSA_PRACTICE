package com.leetcode.strings;

import java.util.HashMap;

/*Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 * 
 */
public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern = "abba";
		String t = "dog cat cat fish";
		boolean isPattern = findPattern(pattern, t);
		System.out.println(isPattern);
	}

	private static boolean findPattern(String pattern, String t) {
		// TODO Auto-generated method stub

		 String[] word = t.split(" ");
	        if(word.length != pattern.length()) return false;

	        HashMap<Character, String> map = new HashMap<>();
	        for(int i=0; i<pattern.length(); i++){
	            char c = pattern.charAt(i);

	            if(map.containsKey(c)){
	                if(!map.get(c).equals(word[i])){
	                    return false;
	                }
	            }else {
	                if(map.containsValue(word[i])){
	                    return false;
	                }
	                map.put(c, word[i]);
	            }
	        }

	        return true;
	}

}
