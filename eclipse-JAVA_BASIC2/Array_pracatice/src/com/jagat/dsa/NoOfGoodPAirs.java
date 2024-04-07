package com.jagat.dsa;
//find numbewr of good pairs in array
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.
public class NoOfGoodPAirs {

	public static void main(String[] args) {
		int a[]  = {1,1,1,1};
		int result = goodPairs(a);
		System.out.println("good pairs are ==>"+result);

	}

	public static int goodPairs(int a[]) {
		int count =0;
		for(int i=0; i<a.length;i++) {
			for(int j= i+1;j <a.length;j++) {
				if(a[i] == a[j] && i<j) {
					count++;
				}
			}
		}
		return count;
		
	}
}
