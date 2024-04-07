package com.jagat.GFGPRACTICE.ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;

public class LeaderInArray {

	public static void main(String[] args) {

int arr[] = {7,10,14,16,5,2};

int result[] = new int[arr.length];
result = leader(arr);
System.out.println("leaderes are =>"+Arrays.toString(result));

	}

	
	public static int[] leader(int arr[]) {

		int n = arr.length;
		int maXright = arr[n-1]; // rightmost is always the leader
       ArrayList<Integer> leader = new ArrayList<>();
       leader.add(maXright);
       
       for( int i= n-2; i>0;i--) {
    	   if(arr[i] > maXright) {
    		   maXright = arr[i];
    		   leader.add(maXright);
    		   
    	   }
       }
		
       int res[] = new int[leader.size()];
       for(int i=0 ;i<leader.size();i++) {
    	   res[i] = leader.get(i);
       }
       
       int left = 0;
        int right = res.length-1;
        while(left< right) {
        	int temp = res[left];
        	res[left] = res[right];
        	res[right] = temp;
        	left ++;
        	right--;
        }
        
		return res;
}
}
