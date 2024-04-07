package com.jagat.GFGPRACTICE.ARRAYS;
//Find the majority element in the array. 
//A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).
public class MajorityElemetinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
	int res = findMajority(arr);
	if(res == 0) {
		System.out.println("not found any majority element");
	}else {
		System.out.println("majority elem4et is ==>"+res);
	}

	}
	
	public static int findMajority(int arr[]) {
		
		int n = arr.length;
		int index = -1;
		int maxCount = 0;
		for(int i=0; i<n;i++) {
			int count = 0;
			
			for(int j=0; j<n ;j++) {
				if(arr[j] == arr[i])
					count++;
			           }
			if(count > maxCount) {
				maxCount = count;
				index = i;
			}
			      }
		
		if(maxCount > n/2)
			return arr[index];
		return 0;
		
		
	}
}

