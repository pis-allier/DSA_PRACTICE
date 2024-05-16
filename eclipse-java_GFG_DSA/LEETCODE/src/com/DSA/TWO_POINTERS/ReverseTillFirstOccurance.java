package com.DSA.TWO_POINTERS;

/*
 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends 
 * at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). 
The resulting string will be "dcbaefd".
Return the resulting string.
Example 1:
Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3. 
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
Example 2:
Input: word = "xyxzxe", ch = "z"
Output: "zxyxxe"
Explanation: The first and only occurrence of "z" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
Example 3:
Input: word = "abcd", ch = "z"
Output: "abcd"
Explanation: "z" does not exist in word.
You should not do any reverse operation, the resulting string is "abcd".
 */
public class ReverseTillFirstOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		char ch = 'z';
		String res = reverseTillIndex(s, ch);
		System.out.println(res);

	}

	private static String reverseTillIndex(String s, char ch) {
		// TODO Auto-generated method stub
		int indexOfCh = s.indexOf(ch);
		char[] a = s.toCharArray();
		if (indexOfCh > 0) {
			int low = 0;
			int high = indexOfCh;
			while (low <= high) {
				char temp = a[low];
				a[low] = a[high];
				a[high] = temp;
				low++;
				high--;
				
			}
		} else {

			return s;
		}

   return new String(a);
	}

}
