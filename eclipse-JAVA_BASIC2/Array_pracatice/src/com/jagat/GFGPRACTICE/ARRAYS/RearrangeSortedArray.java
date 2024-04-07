package com.jagat.GFGPRACTICE.ARRAYS;

public class RearrangeSortedArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        arrange(arr);

        // Print the rearranged array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void arrange(int arr[]) {
        int n = arr.length;
        int max_idx = n - 1;
        int min_idx = 0;
        int max_element = (int)arr[max_idx] + 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[max_idx] % max_element) * max_element;
                max_idx--;
            } else {
                arr[i] += (arr[min_idx] % max_element) * max_element;
                min_idx++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / max_element;
        }
    }
}
