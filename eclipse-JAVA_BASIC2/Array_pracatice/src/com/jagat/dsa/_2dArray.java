package com.jagat.dsa;

// Finding the row with the maximum number of 1s in a 2D array
public class _2dArray {

    public static void main(String[] args) {
        int arr[][] = { {0, 1, 1, 1},
                        {0, 0, 1, 1},
                        {1, 1, 1, 1},
                        {0, 0, 0, 0} };

        int result = maxOnes(arr);
        System.out.println(result);
    }

    public static int maxOnes(int a[][]) {
        int maxRow = -1; // Initialize with an invalid value
        int maxCount = 0;

        for (int row = 0; row < a.length; row++) {
            int count = 0;
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxRow = row;
            }
        }

        return maxRow;
    }
}
