package com.DSA.TWO_POINTERS;

/*Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. Do not include any extra spaces.
Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
 * 
 */
public class ReverseStringExtraspaceRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "  hello world  ";
		String res = reverseWord(s);
		System.out.print("\"" + res.trim() + "\"");
	}

	private static String reverseWord(String s) {
		// TODO Auto-generated method stub
		String[] a = s.split("\\s+");
		int left = 0;
		int right = a.length - 1;
		while (left < right) {
			String tem = a[left];
			a[left] = a[right];
			a[right] = tem;
			left++;
			right--;

		}
		String res = String.join(" ", a);
		return res;

	}

}
