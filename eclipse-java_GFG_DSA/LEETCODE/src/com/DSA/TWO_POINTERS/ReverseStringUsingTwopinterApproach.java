package com.DSA.TWO_POINTERS;

/*
 * Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
 */
public class ReverseStringUsingTwopinterApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = { "h", "e", "l", "l", "o" };
		reverseaString(s);
	}

	private static void reverseaString(String[] s) {
		// TODO Auto-generated method stub

		int low = 0;
		int high = s.length - 1;
		while (low < high) {

			String temp = s[low];
			s[low] = s[high];
			s[high] = temp;

			low++;
			high--;
		}

		for(String r : s) {
			System.out.print(r + " ");
		}
	}

}
