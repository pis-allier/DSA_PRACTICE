package com.DUMMY2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] array = {"jagatg", "grtgewtgw", "gtgetgrwe"};
		System.out.println();
		for(String s : array) {
			System.out.println(s+ "");
			
		}
		System.out.println("----------------------------------------------");
		String [] array2 = new String[5];
		array2[0] = "hyhertwr";
		array2[1] = "gfrweqw";
		array2[2]  =  "fewrqwetgh";
		for(String s : array2) {
			System.out.println(s+ "");
		}
		System.out.println("---------------------------------------------->");
		String h1 = "ytuytjrtyd";
		String s2 = "fgrewyghjet";
		int noOfItems = 3;
		array2[noOfItems++] = h1;
		array2[noOfItems++] = s2;
		System.out.println("------------------------------------------------>>>>>");
		System.out.println(Arrays.toString(array2));
		System.out.println("---------------------array list--------------------------->");
		//converting array to array list
		String addnew  = "Ashok bhai poriya";
		
		//converting String array to arraylist
		List<String> list = new ArrayList<String>(Arrays.asList(array));
		list.add(addnew);
		//now convert array lsit to array
		array = list.toArray(array);
		System.out.println("Array is =====>"+Arrays.toString(array));
		
		
		
		
		
		
		
		
		
		
	}

}
