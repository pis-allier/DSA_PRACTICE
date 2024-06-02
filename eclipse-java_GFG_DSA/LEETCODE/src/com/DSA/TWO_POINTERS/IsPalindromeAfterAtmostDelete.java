package com.DSA.TWO_POINTERS;

/*
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
Example 1:
Input: s = "aba"
Output: true
Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:
Input: s  "abc"
Output: false
 */
public class IsPalindromeAfterAtmostDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abc";
		boolean isPalindrome = checkPalindrome(s);
		System.out.print(isPalindrome);

	}

	private static boolean checkPalindrome(String s) {
		// TODO Auto-generated method stub
		// Map<Character, Character> map = new HashMap<>();

		char[] res = s.toCharArray();
		int low = 0;
		int high = res.length - 1;
		while (low < high) {

			if (res[low] != res[high]) {
				return isPalindrome(res, low + 1, high) || isPalindrome(res, low, high - 1);
			}
			low++;
			high--;
		}

		return true;
	}

	private static boolean isPalindrome(char[] res, int low, int high) {
		// TODO Auto-generated method stub
		while (low < high) {
			if (res[low] != res[high]) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}

}
