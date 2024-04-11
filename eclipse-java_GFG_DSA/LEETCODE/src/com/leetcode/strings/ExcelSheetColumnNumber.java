package com.leetcode.strings;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String columnTitle = "ZX";
		int coulmunNo = findCoumnNumber(columnTitle);
		System.out.println(coulmunNo);
	}

	private static int findCoumnNumber(String columnTitle) {
		// TODO Auto-generated method stub
		int result = 0;
		for (int i = 0; i < columnTitle.length(); i++) {
			result *= 26;
			result += columnTitle.charAt(i) - 'A' + 1;
		}
		return result;

	}

}
