package com.DUMMY;

import java.util.Arrays;

public class ArrayDeleteValues {
    // delete specific element from an array
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int a[] = {5, 10, 20, 30, 4};
        int size = a.length;
        System.out.println("original size of the array is  " + size);
        int elementDelete = 20;
        int newSize = deleteElement(a, size, elementDelete);
        System.out.println("new size of the array is  " + newSize);
    }

    private static int deleteElement(int[] a, int size, int elementDelete) {
        // TODO Auto-generated method stub
        // search for the element to be deleted
        int i;
        for (i = 0; i < size; i++) {
            if (a[i] == elementDelete)
                break;
        }

        // If the element is not found, return the original size
        if (i == size) {
            return size;
        }

        // Shift elements to the left to overwrite the element to be deleted
        for (int j = i; j < size - 1; j++) {
            a[j] = a[j + 1];
        }

        System.out.println(Arrays.toString(a));
        return size - 1;
    }
}
