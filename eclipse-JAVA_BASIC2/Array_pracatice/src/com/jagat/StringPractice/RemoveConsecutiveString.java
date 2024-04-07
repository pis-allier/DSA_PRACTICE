package com.jagat.StringPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveConsecutiveString {

	public static void main(String[] args) {
		String s = "aabb";
		System.out.println("original String ==>"+s);
		String res = removeConsistent(s);
		System.out.println(res);

	}
	public static String removeConsistent(String s) {
		List<Character> list  = new ArrayList<>();
		list.add(s.charAt(0));
		for(int i=1;i <s.length();i++) {
			char currentChar = s.charAt(i);
			char prevChar = list.get(list.size()-1);
			if(currentChar!= prevChar) {
				list.add(currentChar);
			}
		}
		StringBuilder sb = new StringBuilder(list.size());
		for(char c: list) {
			sb.append(c);
		}
		return sb.toString();
	}

}
