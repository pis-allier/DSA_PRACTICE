package com.jagat.GFGPRACTICE;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,6,7,8};
		int n = a.length;
		int expectSum = (n+1) * (n+2)/2;
		int actualsum = Arrays.stream(a).sum();
		int miss = expectSum - actualsum;
		System.out.println(miss);

	}

}
