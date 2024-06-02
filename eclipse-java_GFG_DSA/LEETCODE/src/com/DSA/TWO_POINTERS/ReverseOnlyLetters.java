package com.DSA.TWO_POINTERS;

/*
 * Given a string s, reverse the string according to the following rules:
All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.
Example 1:
Input: s = "ab-cd"
Output: "dc-ba"
Example 2:
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:
Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 */
public class ReverseOnlyLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a-bC-dEf-ghIj";
		String res = reverseOnlyWords(s);
		System.out.print(res);
	}

	private static String reverseOnlyWords(String s) {
		// TODO Auto-generated method stub
		char[] res = s.toCharArray();
		int low = 0;
		int high = res.length - 1;
		while (low < high) {
			while (low < high && !Character.isLetter(s.charAt(low))) {
				low++;
			}
			while (low < high && !Character.isLetter(s.charAt(high))) {
				high--;
			}

			char temp = res[low];
			res[low] = res[high];
			res[high] = temp;
			low++;
			high--;
		}

		String resf = new String(res);
		return resf;
	}

}
