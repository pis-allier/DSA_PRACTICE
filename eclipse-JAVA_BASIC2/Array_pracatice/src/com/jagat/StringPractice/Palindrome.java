package com.jagat.StringPractice;
//cant handle all test cases check leetcode 
public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean res = is_palindrome(s);
        System.out.println("Is it a palindrome? " + res);
    }

    public static boolean is_palindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String n = s.toLowerCase();

        for (char c : n.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }

        String cleanedString = sb.toString();
        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
}
}