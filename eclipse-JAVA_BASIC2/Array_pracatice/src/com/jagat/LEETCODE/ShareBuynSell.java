package com.jagat.LEETCODE;

public class ShareBuynSell {

	public static void main(String[] args) {
		int a[]  = {7,1,5,3,6,4};
		
		int profit = buyOrSell(a);
		System.out.println("max profit is====>"+profit);
	}

	/*
	 * public static int buyOrSell(int a[]) { int maxProfit=0;
	 * 
	 * for(int i=0;i<a.length;i++) { for(int j=i+1;j<a.length;j++) { if(a[j]>a[i]) {
	 * int difference = a[j]- a[i]; if(difference>maxProfit) maxProfit = difference;
	 * } } } return maxProfit; } }
	 */
// optimised APPROACH USING SING LE LOOP

  public static int buyOrSell(int a []) 
  { 
	  int min = Integer.MAX_VALUE;
     int profit=0; 
     for(int i=0; i<a.length;i++) 
     { 
    	 if(a[i] <min) 
    		 min = a[i]; 
    	 if(a[i]- min > profit) 
    		 profit = a[i]-min; 
    	 } 
     return profit; 
     }
}
 