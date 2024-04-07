package com.jagat.Arrays;

import java.util.Arrays;

//average of arrays elements
public class AverageArray {

	public static void main(String[] args) {

		int a[] = {1,2,3,6,58,8,8,9,6,5,4,7,8};
		System.out.println("original arrays=>"+Arrays.toString(a));
		
		System.out.println("Average is ==>"+average(a));
		

	}
  public static int average(int n[]) throws ArithmeticException {
	  int sum=0;
	  int avg=0;
	  
	  if(n == null) {
		  
		  System.err.println("empty array");
	  }else {
		  
		  for(int a : n) {
			  
			  sum+= a;
			  
		  }
		  avg = (sum / n.length);
	  }
	  
	  return avg;
	  
	
}
	
}
