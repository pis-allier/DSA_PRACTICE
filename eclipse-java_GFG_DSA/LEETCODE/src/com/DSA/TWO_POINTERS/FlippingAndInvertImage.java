package com.DSA.TWO_POINTERS;

/*
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0,1,1] results in [1,0,0].
Example 1:
Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:
Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 
 * 
 */
public class FlippingAndInvertImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		int rows = image.length;
		int cols = image[0].length;
		int[][] res = new int[rows][cols];

		res = flipAndInvertImage(image);
		 System.out.println("Resulting Image:");
	        printMatrix(res);

	}

	private static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] res = new int[n][n];

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left <= right) {
                // Flip and invert the elements
                int temp = 1 - image[i][right]; // Invert and store the right element in temp
                res[i][right] = 1 - image[i][left]; // Invert and assign the left element to the right position
                res[i][left] = temp; // Assign temp to the left position

                left++;
                right--;
            }
        }

        return res;
    }

    // Method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}
