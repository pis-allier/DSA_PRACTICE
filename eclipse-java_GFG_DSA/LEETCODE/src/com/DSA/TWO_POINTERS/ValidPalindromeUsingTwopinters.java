package com.DSA.TWO_POINTERS;
//try to  use two pinter approach

/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */
public class ValidPalindromeUsingTwopinters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = " ";
		boolean isPalindrome = checkPalindrome(s);
		System.out.print(isPalindrome);
	}

	private static boolean checkPalindrome(String s) {
		// TODO Auto-generated method stub

		char[] res = s.toLowerCase().replaceAll("[^a-zA-Z]", "").toCharArray();

		int low = 0;
		int high = res.length - 1;
		while (low < high) {
			if (res[low] == res[high]) {
				System.out.println("matching......");
				low++;
				high--;
			} else {
				return false;
			}
		}

		return true;
	}

}
