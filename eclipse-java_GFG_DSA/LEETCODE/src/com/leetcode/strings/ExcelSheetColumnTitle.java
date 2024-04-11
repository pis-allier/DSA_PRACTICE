package com.leetcode.strings;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int columnNumber = 701;
		String columnTitle = findColumnTitle(columnNumber);
		System.out.println(columnTitle);
	}

	private static String findColumnTitle(int columnNumber) {
		// TODO Auto-generated method stub
		StringBuilder res = new StringBuilder();
		while (columnNumber > 0) {
			int temp = (columnNumber - 1) % 26;
			res.append((char) ('A' + temp));
			columnNumber = (columnNumber - 1) / 26;
		}
		return res.reverse().toString();

	}

}
