package com.jagat.GFGPRACTICE;

import java.util.HashSet;

public class SubarrayContainsZero {
    public static void main(String[] args) {
        int[] array = { 4, 2, -3, 1, 6 };
        boolean hasZeroSumSubarray = containsZeroSumSubarray(array);

        if (hasZeroSumSubarray) {
            System.out.println("The array contains a subarray with 0 sum.");
        } else {
            System.out.println("The array does not contain a subarray with 0 sum.");
        }
    }

    public static boolean containsZeroSumSubarray(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if (array[i] == 0 || sum == 0 || set.contains(sum)) {
                return true;
            }

            set.add(sum);
        }

        return false;
    }
}
