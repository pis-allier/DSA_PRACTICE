package com.jagat.searchingsorting.GFG;
//step ARRAY where differencve of key with adjuscent is at most k
public class SearchuingArray {

	public static void main(String[] args) {

		int a[]= {4, 5, 6, 7, 6};
		int k=1;
		int x =6;
		int index = stepArray(a,k,x);
		System.out.println("index is --->"+index);
		

	}

	public static int stepArray(int a[],int k, int x) {
		int n = a.length;
		int i=0;
		while(i <n) {
			if(a[i] == x) {
				return i;
			}
			i+=Math.max(1, Math.abs( a[i]-x/k));
			
		}
		return -1;
		
	}
}
