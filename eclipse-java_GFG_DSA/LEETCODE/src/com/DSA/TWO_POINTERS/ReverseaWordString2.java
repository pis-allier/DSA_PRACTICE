package com.DSA.TWO_POINTERS;

/*
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:
Input: s = "Mr Ding"
Output: "rM gniD"
 */
public class ReverseaWordString2 {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        int l = 0;
        int r = 0;
        char[] a = s.toCharArray();
        while (l < s.length()) {
            // Find the end of the current word
            while (r < s.length() && a[r] != ' ') {
                r++;
            }
            // Reverse the current word
            reverse(a, l, r - 1);
            // Move to the next word
            l = r + 1;
            r = l; // Reset the end index for the next word
        }
        return String.valueOf(a);
    }

    public static void reverse(char[] s, int l, int r) {
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
