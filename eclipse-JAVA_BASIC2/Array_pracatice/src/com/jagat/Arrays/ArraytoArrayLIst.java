package com.jagat.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoArrayLIst {

	public static void main(String[] args) {
	String [] a = {"Jagat","Ashok", "poriya"};
	ArrayList<String> list = new ArrayList<>(Arrays.asList(a));
	System.out.println(list);

	}

}
