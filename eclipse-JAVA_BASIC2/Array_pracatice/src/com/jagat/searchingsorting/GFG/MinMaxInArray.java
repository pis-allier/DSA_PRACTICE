package com.jagat.searchingsorting.GFG;

public class MinMaxInArray {

    public static void main(String[] args) {
        int a[] = {1, 52, 3, 4, 5, 7, 8};

        int[] res = minmax(a);
        System.out.println("Minimum: " + res[0]);
        System.out.println("Maximum: " + res[1]);
    }

    public static int[] minmax(int a[]) {
        int[] res = new int[2];
        int max = a[0];
        int min = a[0];
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        
        res[0] = min; // Store the minimum value in res[0]
        res[1] = max; // Store the maximum value in res[1]
        
        return res;
    }
}
