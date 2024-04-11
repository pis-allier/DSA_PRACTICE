package com.leetcode.strings;

public class SumOfBinaryStirng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "11";
		String b = "11";
		String res = addBinaryString(a, b);
		System.out.println(res);
	}

	private static String addBinaryString(String a, String b) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		int carry = 0;
		int i = a.length() - 1;
		int j = b.length() - 1;

		while (i >= 0 || j >= 0 || carry > 0) {
			int sum = carry;
			if (i >= 0)
				sum += a.charAt(i--) - '0';
			if (j >= 0)
				sum += b.charAt(j--) - '0';
			result.insert(0, sum % 2);
			carry = sum / 2;
		}

		return result.toString();
	}

}
