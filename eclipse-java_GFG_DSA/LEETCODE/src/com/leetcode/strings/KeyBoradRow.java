package com.leetcode.strings;

/*Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard 
 * like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".
 * 
 */
public class KeyBoradRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "hello", "alaska", "dad", "peace" };
		String[] result = new String[arr.length];
		result = findKeyboardWords(arr);
		for (String x : result) {
			System.out.print(x + " ");
		}

	}

	private static String[] findKeyboardWords(String[] arr) {
		// TODO Auto-generated method stub
		String[] n = new String[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			int check = row(arr[i].charAt(0));
			for (int j = 1; j < arr[i].length(); j++) {
				if (check != row(arr[i].charAt(j))) {
					check = 0;
					break;
				}
			}
			if (check != 0) {
				n[k] = arr[i];
				k++;
			}
		}
		String ans[] = new String[k];
		for (int i = 0; i < k; i++) {
			ans[i] = n[i];
		}
		return ans;
	}

	public static int row(char c) {
		c = Character.toLowerCase(c);
		String str1 = "qwertyuiop";
		String str2 = "asdfghjkl";
		String str3 = "zxcvbnm";
		if (str1.contains(String.valueOf(c))) {
			return 1;
		} else if (str2.contains(String.valueOf(c))) {
			return 2;
		} else if (str3.contains(String.valueOf(c))) {
			return 3;
		}
		return 0;
	}

}
