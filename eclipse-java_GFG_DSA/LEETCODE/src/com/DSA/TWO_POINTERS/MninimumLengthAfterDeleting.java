package com.DSA.TWO_POINTERS;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a string s consisting only of characters 'a', 'b', and 'c'.
 *  You are asked to apply the following algorithm on the string any number of times:
Pick a non-empty prefix from the string s where all the characters in the prefix are equal.
Pick a non-empty suffix from the string s where all the characters in this suffix are equal.
The prefix and the suffix should not intersect at any index.
The characters from the prefix and suffix must be the same.
Delete both the prefix and the suffix.
Return the minimum length of s after performing the above operation any number of times (possibly zero times).
Example 1:
Input: s = "ca"
Output: 2
Explanation: You can't remove any characters, so the string stays as is.
Example 2:
Input: s = "cabaabac"
Output: 0
Explanation: An optimal sequence of operations is:
- Take prefix = "c" and suffix = "c" and remove them, s = "abaaba".
- Take prefix = "a" and suffix = "a" and remove them, s = "baab".
- Take prefix = "b" and suffix = "b" and remove them, s = "aa".
- Take prefix = "a" and suffix = "a" and remove them, s = "".
 * 
 */
public class MninimumLengthAfterDeleting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cabaabac";
		int resLength = deletePrefixSuffix(s);
		System.out.print(resLength);

	}

	private static int deletePrefixSuffix(String s) {
		// TODO Auto-generated method stub
		int begin = 0;
		int end = s.length() - 1;

		// Delete similar ends until the ends differ or they meet in the middle
		while (begin < end && s.charAt(begin) == s.charAt(end)) {
			char c = s.charAt(begin);

			// Delete consecutive occurrences of c from prefix
			while (begin <= end && s.charAt(begin) == c) {
				begin++;
			}

			// Delete consecutive occurrences of c from suffix
			while (end > begin && s.charAt(end) == c) {
				end--;
			}
		}

		// Return the number of remaining characters
		return end - begin + 1;
	}

}
