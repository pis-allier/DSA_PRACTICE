package com.jagat.Arrays;

import java.util.HashSet;

public class Commonelements {

    public static void main(String[] args) {
        String[] arr1 = {"jagat", "poriya", "itcompanay", "bullshit"};
        String[] arr2 = {"jagat", "itcompany", "foreign","poriya","bullshit"};

        isCommon(arr1, arr2);
    }

    public static void isCommon(String[] arr1, String[] arr2) {
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    set.add(arr1[i]);
                    break; 
                }
            }
        }

        System.out.println(set);
    }
}
