package com.jagat.Arrays;
//replace element with another element
import java.util.Arrays;

public class SpecificElement {

	public static void main(String[] args) {
	int a[] = {1,2,3,4,5};
	System.out.println("origninal array==>"+Arrays.toString(a));
	int newVal = 8;
	int position = 1;
	for(int i= position; i> a.length-1; i--) {
		a[i]= a[i-1];
		
	}
	a[position] = newVal;
	System.out.println("new Arrays==>"+Arrays.toString(a));

	}

}
