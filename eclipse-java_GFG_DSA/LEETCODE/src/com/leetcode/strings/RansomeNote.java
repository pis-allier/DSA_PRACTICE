package com.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
 */
public class RansomeNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ransomeNote = "aa";
		String magazine = "aab";
		boolean isConstructed = isConstructedRansome(ransomeNote, magazine);
		System.out.println(isConstructed);
	}

	private static boolean isConstructedRansome(String ransomeNote, String magazine) {
		// TODO Auto-generated method stub
		Map<Character, Integer> countFreq = new HashMap<>();
		for (char ch : magazine.toCharArray()) {
			countFreq.put(ch, countFreq.getOrDefault(ch, 0) + 1);
		}
		// check if ransome note can be made using magzine
		for (char ch : ransomeNote.toCharArray()) {
			if (!countFreq.containsKey(ch) || countFreq.get(ch) == 0) {
				return false;
			}
			/*
			 * charFrequency.get(ch): This retrieves the current frequency count of the
			 * character ch from the charFrequency map. It gets the value associated with
			 * the key ch in the map.
			 * 
			 * - 1: We subtract 1 from the current frequency count. This is because we're
			 * using the character ch from the ransom note, which means we're consuming one
			 * occurrence of this character from the magazine.
			 * 
			 * charFrequency.put(ch, ...): Finally, we update the charFrequency map with the
			 * new frequency count for the character ch. We use the .put() method to
			 * associate the updated frequency count with the character ch in the map.
			 * 
			 * By subtracting 1 from the frequency count of ch in the charFrequency map,
			 * we're effectively indicating that one occurrence of the character ch has been
			 * used in constructing the ransom note.
			 * 
			 */
			countFreq.put(ch, countFreq.get(ch) - 1);
		}
		return true;
	}

}
