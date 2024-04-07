package com.jagat.StringPractice;

import java.util.HashMap;
import java.util.Map;

public class PrintAllDuplicatesInString {

	public static void main(String[] args) {
	String s = "geeksforgeeks";
	isduplicates(s);

	}
	
	public static void isduplicates(String s) {
		
		Map<Character, Integer> count = new HashMap<>();
		for(int i=0;i< s.length();i++) {
			if(count.containsKey(s.charAt(i))) {
				count.put(s.charAt(i), count.get(s.charAt(i))+1);
			}else {
				count.put(s.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> mapelement : count.entrySet()) {
			if(mapelement.getValue()>1) {
				System.out.println(mapelement.getKey() + ", count = " + mapelement.getValue());
			}
			
		}
	}
	

}
