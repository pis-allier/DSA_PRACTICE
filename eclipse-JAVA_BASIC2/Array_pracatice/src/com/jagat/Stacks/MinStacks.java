package com.jagat.Stacks;
//create stack to show various operations ;

import java.util.Stack;

public class MinStacks {

	Stack<Node> s;

	class Node {
		int val;
		int min;

		public Node(int val, int min) 
			{
			this.val = val;
			this.min = min;
		   }
	}

	
	public MinStacks() {
		this.s = new Stack<Node>();	
	}
	
	public void push(int x) {
		if(s.isEmpty()) {
			this.s.push(new Node(x,x));
		}else {
			int min = Math.min(this.s.peek().min, x);
			this.s.push(new Node(x, min));
		}
	}
	public  int pop() {
		return this.s.pop().val;
		
	}
	public int top() {
		return this.s.peek().val;
	}
	public int getMin() {
		return this.s.peek().min;
	}
}

class DriverClass {
	public static void main(String[] args) {

MinStacks minStack = new MinStacks();
minStack.push(-1);
minStack.push(10);
minStack.push(-4);
minStack.push(0);
System.out.println(minStack.getMin());
System.out.println(minStack.pop());
System.out.println(minStack.pop());
System.out.println(minStack.getMin());

	}
}