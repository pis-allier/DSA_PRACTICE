package com.jagat.GFGPRACTICE;

import java.util.Arrays;

// all positives appear before negatives
public class PositiveBeforeNegaive {

    public static void main(String[] args) {

        int a[] = { -3, -2, -1, 6, 5, 4 };

        System.out.println("original array==>" + Arrays.toString(a));

        sortedArray(a);
        System.out.println("sorted array==>" + Arrays.toString(a));

    }

    public static void sortedArray(int a[]) {
        // two pointer approach
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            // find next positive element from left
            while (left < a.length && a[left] >= 0) {
                left++;
            }
            // find next negative element from right
            while (right >= 0 && a[right] < 0) {
                right--;
            }

            if (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
    }
}
