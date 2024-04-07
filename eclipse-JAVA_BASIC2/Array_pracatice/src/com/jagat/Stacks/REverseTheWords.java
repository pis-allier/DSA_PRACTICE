package com.jagat.Stacks;

import java.util.Stack;

public class REverseTheWords {

	public static void main(String[] args) {
	  String word = "jagat";
	  String reversed  =  is_reversed(word);
	  System.out.println("word is reversed ==>"+reversed);
		
	}

	public static String is_reversed(String words) {
		
		Stack<Character > rev = new Stack<>();
		 for(char wor : words.toCharArray()) {
			 rev.push(wor);
			 while(rev.empty() == true) {
				 rev.pop();
			 }
			 
			 
		 }
		StringBuilder sb = new StringBuilder();
		while(!rev.isEmpty()) {
			sb.append(rev.pop());
		}
		 return sb.toString();
	}
}
