package com.jagat.GFGPRACTICE.ARRAYS;

public class FrequenciesOFelement {

	public static void main(String[] args) {

int arr[] = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10} ;
int n= arr.length;
printFreq(arr,n);

	}
	static void printFreq(int arr[], int n)
    {
    	int freq = 1, i = 1;

    	while(i < n)
    	{
    		while(i < n && arr[i] == arr[i - 1])
    		{
    			freq++;
    			i++;
    		}

    		System.out.println(arr[i - 1] + "==> " + freq);

    		i++;
    		freq = 1;
    	}
    	if(n==1 || arr[n-1]!=arr[n-2])
    	System.out.println(arr[n-1]+"=> "+ 1) ;
    }



}
