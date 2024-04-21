package com.jagat.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*A school is trying to take an annual photo of all the students. 
 * The students are asked to stand in a single file line in non-decreasing order by height. 
 * Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
You are given an integer array heights representing the current order that the students are standing in. 
Each heights[i] is the height of the ith student in line (0-indexed).
Return the number of indices where heights[i] != expected[i].
Example 1:
Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
 * 
 */
public class HeightOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> heights = Arrays.asList(5, 1, 2, 3, 4);
		int indicesCount = findExpectedMismatchPlaces(heights);
		System.out.print(indicesCount);
	}

	private static int findExpectedMismatchPlaces(List<Integer> heights) {
		// TODO Auto-generated method stub
		List<Integer> actualHeights = new ArrayList<>(heights);
		List<Integer> expected = heights.stream().sorted().collect(Collectors.toList());
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < expected.size(); i++) {
			if (!(expected.get(i) == actualHeights.get(i))) {
				res.add(i);
			}
		}
		long count = res.stream().count();

		return (int) count;
	}

}
