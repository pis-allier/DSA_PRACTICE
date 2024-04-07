package com.jagat.Arrays;
//Test if Arrays contains specific value
public class SpecificValue {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int x=5 ;
		boolean isPresent = isCheck(a,x);
		System.out.println(isPresent);
	}
  public static boolean isCheck(int [] a, int x) {
	  
	  for(int n : a) {
		  if(n == x) {
			  return true;
		  }
	  }
	  return false;
	  
  }
	
}
