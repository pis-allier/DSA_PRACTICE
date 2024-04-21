package com.jagat.DSAPATTERNS;

import java.util.Arrays;
import java.util.LinkedList;

//full optimised solution
/*
 * Given N intervals, where each interval denotes startTime and endTime. 
 * The task is to merge all overlapping intervals possible and return a list of overlapping intervals in sorted order of their startTime.
 * 
 * Input:  intervals[] = {[1, 3],[2, 6],[8, 10],[15, 18]}
Output: {[1,6],[8,10],[15,18]}
 */
public class MergedIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] res = finOverlappingIntervals(intervals);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print("[");
				System.out.print(res[i][j] + " ");
				System.out.print("]");
				// Added space for separation
			}
			System.out.println(); // Move to the next line after printing each interval
		}
	}

	private static int[][] finOverlappingIntervals(int[][] intervals) {
		// TODO Auto-generated method stub

		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		LinkedList<int[]> merged = new LinkedList<>();
		for (int[] interval : intervals) {
			if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
				merged.add(interval);
			} else {
				merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
			}
		}
		return merged.toArray(new int[merged.size()][]);

	}

}
