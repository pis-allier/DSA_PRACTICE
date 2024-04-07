package com.jagat.Stacks;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
	 
		String s = "(]";
		
		boolean is_valid = checkValid(s);
		System.out.println("is valid parenthesis ==>"+is_valid);
		
	}
	
	public static boolean checkValid(String s) {
		
	   Stack<Character> stack  =new Stack<>();
	   for(char c : s.toCharArray()) {
		   if(c == '(' || c== '[' || c== '{') {
			   stack.push(c);
		   }else {
			   if(stack.isEmpty()) {
				   return false;
			   }
			   
			   char top = stack.pop();
			   if(c== ')' && top != '(' || c== ']' && top !='[' || c== '}' && top != '{') {
				   return false;
			   }
			   
		   }
	   }
	   
	   return stack.isEmpty();
	   
	}
}
//alternate
/*
 * class Solution { public boolean isValid(String s) { Stack<Character> stack =
 * new Stack<Character>(); for (char c : s.toCharArray()) { if (c == '(')
 * stack.push(')'); else if (c == '{') stack.push('}'); else if (c == '[')
 * stack.push(']'); else if (stack.isEmpty() || stack.pop() != c) return false;
 * } return stack.isEmpty(); } }
 */


