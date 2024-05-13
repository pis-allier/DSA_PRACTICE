package com.DSA.TWO_POINTERS;

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
public class ReverseVOweels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "leetcode";
		String res = reverseVowel(s);
		System.out.print(res);

	}

	private static String reverseVowel(String s) {
		// TODO Auto-generated method stub
		char[] word = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;
		String vowels = "aeiouAEIOU";
		while (start < end) {
			while (start < end && vowels.indexOf(word[start]) == -1) {
				start++;
			}
			while (start < end && vowels.indexOf(word[end]) == -1) {
				end--;
			}

			char temp = word[start];
			word[start] = word[end];
			word[end] = temp;
			start++;
			end--;
		}
		String res = new String(word);
		return res;

	}

}
