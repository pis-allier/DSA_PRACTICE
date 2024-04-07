package com.jagat.StringPractice;

public class LargestCommonPrefix {

	public static void main(String[] args) {
	
		String []  strs = {"flower","flow","flight"};
		String res = largestCommonPrefix(strs);
		System.out.println("largest Com,mon prefix is ==>"+res);

	}
	public static String largestCommonPrefix(String [] strs) {
		if(strs== null || strs.length==0) {
			return "";
		}
		String prefix = strs[0];
		for(int i=0;i<strs.length;i++) {
			while(strs[i].indexOf(prefix)!=0) {
				prefix = prefix.substring(0, prefix.length()-1);
			}
			if(prefix.isEmpty()) {
				return "";
			}
		}
		return prefix.toString();
	}

}
