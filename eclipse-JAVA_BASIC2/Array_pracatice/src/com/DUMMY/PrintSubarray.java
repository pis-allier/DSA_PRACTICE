package com.DUMMY;

public class PrintSubarray {

    // A subarray is a contiguous part of an array. Any array of length n contains n*(n+1)/2 subarrays of length 1 or more.
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("All subarrays:");

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                System.out.print("[ ");
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.print("]");
                System.out.println();
            }
        }
    }
}
