package com.leetcode.strings;

public class LexicographicallySmallestCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] letters = { 'c', 'f', 'j' };
		char target = 'a';
		char c = smallestAmongTHem(letters, target);
		System.out.println(c);
	}

	private static char smallestAmongTHem(char[] letters, char target) {
		// TODO Auto-generated method stub
		char min = Character.MAX_VALUE; // Initialize min with the maximum possible character value

		// Iterate through each letter in the array
		for (char letter : letters) {
			// Compare the current character with the target and update the min accordingly
			if (letter > target && letter < min) {
				min = letter;
			}
		}

		// If min is still Character.MAX_VALUE, it means no character in the array is
		// greater than the target
		// In this case, return the target character
		if (min == Character.MAX_VALUE) {
			return letters[0];
		}

		// Otherwise, return the smallest character found
		return min;
	}

}
