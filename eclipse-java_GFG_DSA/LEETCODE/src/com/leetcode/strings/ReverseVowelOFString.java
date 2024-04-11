package com.leetcode.strings;

//reverse only vowel of string and reverese it
/*
 * Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1:
Input: s = "hello"
Output: "holle"
Example 2:
Input: s = "leetcode"
Output: "leotcede"
 */
//using two pointer approach
public class ReverseVowelOFString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		String res = reverseVowel(s);
		System.out.println(res);

	}

	private static String reverseVowel(String s) {
		// TODO Auto-generated method stub

		char[] word = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;
		String vowels = "aeiouAEIOU";

		while (start < end) {
			// Move start pointer until it points to a vowel
			while (start < end && vowels.indexOf(word[start]) == -1) {
				start++;
			}

			// Move end pointer until it points to a vowel
			while (start < end && vowels.indexOf(word[end]) == -1) {
				end--;
			}

			// Swap the vowels
			char temp = word[start];
			word[start] = word[end];
			word[end] = temp;

			// Move the pointers towards each other
			start++;
			end--;
		}

		String answer = new String(word);
		return answer;
	}

}
