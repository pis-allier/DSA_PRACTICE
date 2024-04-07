package com.DUMMY;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesUsingHashMap {
	public static void main(String[] args) {
        // Sample array with duplicates
        int[] inputArray = {1, 2, 3, 4, 2, 5, 6, 1,2,3,4,5,6,1,2,3,4,5,6,7};

        // Remove duplicates
        int[] resultArray = removeDuplicates(inputArray);

        // Display the array without duplicates
        System.out.println("Array without duplicates: " + Arrays.toString(resultArray));
    }

    public static int[] removeDuplicates(int[] array) {
        // Use a HashSet to store unique elements
        HashSet<Integer> uniqueSet = new HashSet<>();

        // Traverse the input array and add each element to the set
        for (int element : array) {
            uniqueSet.add(element);
        }

        // Create a new array to store unique elements
        int[] resultArray = new int[uniqueSet.size()];

        // Copy elements from the set to the new array
        int index = 0;
        for (int element : uniqueSet) {
            resultArray[index++] = element;
        }

        return resultArray;
    }

}
