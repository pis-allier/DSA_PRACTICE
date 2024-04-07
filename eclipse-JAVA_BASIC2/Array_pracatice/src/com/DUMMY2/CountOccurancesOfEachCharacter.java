package com.DUMMY2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurancesOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Gangaikondacholapuram";
		countCharacters(s);

	}

	private static void countCharacters(String s) {
		// TODO Auto-generated method stub

		Map<String, Long> result = Arrays.stream(s.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));
		System.out.println(result);

	}

}
