package com.jagat.GFGPRACTICE.ARRAYS;

import java.util.Arrays;

public class LeftRotateArrayBy1 {
//left roate means move one postition left 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] =  {10,20,30,40,50};
		leftRotateArray(arr);
	}

	public static void leftRotateArray(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;

        System.out.println(Arrays.toString(arr));
    }

}
