package com.jagat.StringPractice;

public class CheckPanagramString {

	public static void main(String[] args) {
		String s = "thequickbrownfoxjumpsoverthelazydog";
		boolean check_result = is_panagram(s);
		System.out.println("result is ===>"+check_result);
	}
	
public static boolean is_panagram(String s) {
	boolean [] alphabetCheck = new boolean[26];
	for(char c : s.toCharArray()) {
		if('a' <=c && c<= 'z') {
		alphabetCheck[c-'a'] = true;
		}
	}
	for(boolean c : alphabetCheck) {
		if(!c) {
			return false;
		}
	}
	return true;
}
}
