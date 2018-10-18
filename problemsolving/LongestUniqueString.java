package com.vikas.problemsolving;

import java.util.HashMap;
import java.util.Map;

// Java Program to find Longest Unique Characters Count.

public class LongestUniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myString = "ABECAFGHIA";
		System.out.println(findLongestUniqueCount(myString));

	}

	private static int findLongestUniqueCount(String myString) {
		// TODO Auto-generated method stub
		Map<Character, Integer> counterMap = new HashMap<>();
		int max_len = Integer.MIN_VALUE;
		char[] words = myString.toCharArray();
		int start = 0;
		int appearance = 0;

		for (int i = start; i <= words.length - 1; i++) {
			if (counterMap.containsKey(words[i])) {
				counterMap = new HashMap<>();
				start = start + 1;
				i = start - 1;
				appearance = 0;
			} else {
				counterMap.put(words[i], appearance);
				appearance++;
				if (appearance > max_len) {
					max_len = appearance;
				}
			}
		}
		return max_len;
	}

}
