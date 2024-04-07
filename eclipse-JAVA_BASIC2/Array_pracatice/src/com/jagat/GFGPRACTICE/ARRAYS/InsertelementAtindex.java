package com.jagat.GFGPRACTICE.ARRAYS;

import java.util.Arrays;

public class InsertelementAtindex {

	public static void main(String[] args) {

int a []  = new int[5];
for(int i=0; i<=a.length-1;i++) {
	a[i] = i;

}
System.out.println(Arrays.toString(a));
if(a.length <5) {
	for(int i=0; i<a.length+1;i++)
		a[6] = 25;
}

	}

}
