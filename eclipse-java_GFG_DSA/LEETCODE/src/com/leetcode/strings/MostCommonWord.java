package com.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a string paragraph and a string array of the banned words banned, 
 * return the most frequent word that is not banned. 
 * It is guaranteed there is at least one word that is not banned, and that the answer is unique.
The words in paragraph are case-insensitive and the answer should be returned in lowercase.
 */
public class MostCommonWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = { "hit" };
		String res = mostUnbannedWord(paragraph, banned);
		System.out.println(res + " is the most frequet word that is not banned ");

	}

	private static String mostUnbannedWord(String paragraph, String[] banned) {
		String[] words = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
		Map<String, Integer> wordCounts = new HashMap<>();

		for (String word : words) {
			if (!isBanned(word, banned)) {
				int count = wordCounts.getOrDefault(word, 0) + 1;
				wordCounts.put(word, count);
			}
		}

		String mostFrequentWord = "";
		int maxCount = 0;

		for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				mostFrequentWord = entry.getKey();
			}
		}

		return mostFrequentWord;
	}

	private static boolean isBanned(String word, String[] banned) {
		for (String bannedWord : banned) {
			if (word.equals(bannedWord.toLowerCase())) {
				return true;
			}
		}
		return false;
	}
}
