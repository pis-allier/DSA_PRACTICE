package com.jagat.StringPractice;

import java.util.HashSet;
import java.util.Set;

public class ConsistentString {

	public static void main(String[] args) {
	String allowed = "ab"; 
    String [] words = {"ad","bd","aaab","baa","badab"};

 int consi = is_consistent(allowed, words);
    System.out.println(consi);
	}

	public static int  is_consistent(String allowed, String [] words ) {
		
		Set<Character> set = new HashSet<>();
		for(char c : allowed.toCharArray()) {
			set.add(c);
		}
		int count =0;
		for(String word : words) {
			boolean consistent = true;
			for(char c : word.toCharArray()) {
				if(!set.contains(c)) {
					consistent = false;
					break;
					
				}
			}
			if(consistent) {
				count++;
			}
			
		}
		return count;
	}
}
