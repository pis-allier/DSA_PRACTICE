package com.jagat.GFGPRACTICE.ARRAYS;

public class MaxSumSubArrayEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] ={8, -8, 9, -9, 10, -11, 12};
		int res = overallMaxSum(arr);
		System.out.println(res);

	}
	
	private  static int normalMaxSum(int arr[]){
		int res = arr[0];

    	int maxEnding = arr[0];

    	for(int i = 1; i < arr.length; i++)
    	{
    		maxEnding = Math.max(maxEnding + arr[i], arr[i]);

    		res = Math.max(maxEnding, res);
    	}
    	
    	return res;
		
		
	}
	

    static int overallMaxSum(int arr[])
    {
    	int max_normal =normalMaxSum(arr);
        int n = arr.length;
    	if(max_normal < 0)
    		return max_normal;

    	int arr_sum = 0;

    	for(int i = 0; i < n; i++)
    	{
    		arr_sum += arr[i];

    		arr[i] = -arr[i];
    	}

    	int max_circular = arr_sum + normalMaxSum(arr);

    	return Math.max(max_circular, max_normal);
    }

}
