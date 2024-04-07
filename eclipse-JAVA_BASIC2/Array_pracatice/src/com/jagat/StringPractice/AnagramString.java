package com.jagat.StringPractice;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		boolean is_anagram = anagramCheck(s, t);
		System.out.println("is anagram  ===>" + is_anagram);

	}

	public static boolean anagramCheck(String s, String t) {

		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if (a.length != b.length) {
			return false;

		}
		String a1 = new String(a);
		String a2 = new String(b);
		if (a1.equals(a2)) {
			return true;

		} else {
			return false;
		}

	}
}
