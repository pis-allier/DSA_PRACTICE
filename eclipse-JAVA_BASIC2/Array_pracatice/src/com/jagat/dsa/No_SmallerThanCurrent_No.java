package com.jagat.dsa;

import java.util.Arrays;

public class No_SmallerThanCurrent_No {

    public static void main(String[] args) {
        int a[] = {8, 1, 2, 2, 3};
        int res[] = smallerThanCurrent(a);
        System.out.println("numbers smaller than itself ==> " + Arrays.toString(res));
    }

    public static int[] smallerThanCurrent(int a[]) {
        int curr[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
        	int count = 0; // Initialize count for the current element
           
            for (int j = 0; j < a.length; j++) {
                if (a[j] < a[i] && j != i) {
                    count++;
                }
            }
            curr[i] = count; // Store the count for the current element
        }

        return curr;
    }
}
