package com.jagat.GFGPRACTICE.ARRAYS;

import java.util.Arrays;

// Reverse every subarray of size k
public class ReverseSubArrayOfK {

    public static void main(String[] args) {
        int arr[] = {5,6,8,9};
        int n = arr.length;
        int k = 3;
        reverseInGroup(arr, n, k);

       
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseInGroup(int arr[], int n, int k) {
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); // Ensure that 'right' does not go beyond the end of the array

            // Reverse elements in the current subarray using a two-pointer approach
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
}
