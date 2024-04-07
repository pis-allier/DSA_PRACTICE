package com.jagat.Stacks;

import java.util.Stack;

public class FindNextGreaterElement {

    public static void main(String[] args) {

        int a[] = {11, 13, 21, 3};
        int[] nextGreat = findNextGreater(a);

        System.out.println("Next greater elements are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " --> " + nextGreat[i]);
        }
    }

    public static int[] findNextGreater(int a[]) {

        Stack<Integer> s = new Stack<>();
        int n = a.length;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int next = a[i];

            // Pop elements that are smaller than or equal to 'next'
            while (!s.isEmpty() && s.peek() <= next) {
                s.pop();
            }

            if (!s.isEmpty()) {
                result[i] = s.peek(); // Assign the next greater element
            } else {
                result[i] = -1; // If no greater element found, assign -1
            }

            s.push(next); // Push 'next' onto the stack
        }

        return result;
    }
}
