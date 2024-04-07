package com.jagat.StringPractice;

public class MaximumNumberofWordsInSentence {

	public static void main(String[] args) {
	
		String[] sentence = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		
		int maxWords = countMaxInSentence(sentence);
		System.out.println("max words =>"+maxWords);
	}
	
	public static int countMaxInSentence(String []sentence) {
		int countMax= 0;
	for(String sent : sentence) {
		String [] words = sent.split("\\s+");
		countMax = Math.max(countMax, words.length);
	}
		return countMax;
	}

}
