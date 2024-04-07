package com.jagat.Stacks;

import java.util.Stack;

public class ValidAStackSequences {

	public static void main(String[] args) {

		int[] pushed = { 1, 2, 3, 4, 5 };
		int popped[] = { 4, 5, 3, 2, 1 };
		boolean is_valid = correctSeq(pushed, popped);
		System.out.println("is seqwuence valid==>" + is_valid);

	}

	
	public static boolean correctSeq(int [] pushed , int [] popped) {
	
		Stack<Integer> st = new Stack<>();
		
		int k =0;
		for(int i=0; i<pushed.length;i++) {
			st.push(pushed[i]);
			while(!st.isEmpty() && st.peek() == popped[k]) {
				st.pop();
				k++;
			}
		}
		return st.isEmpty();
		
	}
}
