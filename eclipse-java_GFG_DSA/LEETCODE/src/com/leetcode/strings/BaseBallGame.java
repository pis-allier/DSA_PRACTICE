package com.leetcode.strings;

/*
 * You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
You are given a list of strings operations, 
where operations[i] is the ith operation you must apply to the record and is one of the following:
An integer x.
Record a new score of x.
'+'.
Record a new score that is the sum of the previous two scores.
'D'.
Record a new score that is the double of the previous score.
'C'.
Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.
The test cases are generated such that the answer and 
all intermediate calculations fit in a 32-bit integer and that all operations are valid.
Example 1:
Input: ops = ["5","2","C","D","+"]
Output: 30
Explanation:
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.
 */
public class BaseBallGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ops[] = { "5", "2", "C", "D", "+" };
		int sumOfAll = baseBallGameRecord(ops);
		System.out.println(sumOfAll);
	}

	private static int baseBallGameRecord(String[] ops) {
		// TODO Auto-generated method stub
		int[] res = new int[ops.length];
		int size = 0;
		for (String op : ops) {
			if (op.endsWith("+")) {
				res[size] = res[size - 1] + res[size - 2];
				size++;
			} else if (op.endsWith("D")) {
				res[size] = 2 * res[size - 1];
				size++;
			} else if (op.equals("C")) {
				size--;
			} else {
				res[size] = Integer.parseInt(op);
				size++;
			}
		}
		int sum = 0;
		for (int i = 0; i < res.length; i++) {
			sum += res[i];
		}
		return sum;
	}
	// this code has benn pushed too goithub
}