package com.jagat.StringPractice;

public class REverseString {

	public static void main(String[] args) {
	String s =  " hello  world";
	System.out.println("Original String ===>"+s);
	String result = reverseString(s);
	System.out.println("result is ===>"+result);

	}

	public static String reverseString(String s) {
		String [] words = s.trim().split("\\s+");
		StringBuilder reversed = new StringBuilder();
		for(int i=words.length-1; i>=0;i--) {
			reversed.append(words[i]);
			if(i!=0) {
				reversed.append("");
			}
		}
		return reversed.toString();
		
		}

	}

