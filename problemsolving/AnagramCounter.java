/**
 * 
 */
package com.vikas.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Vikas Siva Ravindran
 *	Java Program to Count the number of Anagrams each String has in an Array.
 */
public class AnagramCounter {

	public static void main(String[] args) {

		// Driver program
		String arr[] = { "cat", "dog", "tac", "god", "act", "ikv", "kiv" };
		// printAnagrams(arr);
		printOwnAnagrams(arr);
	}

	/**
	 * @param arr
	 */
	private static void printOwnAnagrams(String[] arr) {
		// TODO Auto-generated method stub

		Map<String, Integer> countMap = new HashMap<>();
		int appearances = 0;

		for (int i = 0; i < arr.length; i++) {

			String word = arr[i];
			char[] wordsArray = word.toCharArray();
			Arrays.sort(wordsArray);
			String presentWord = new String(wordsArray);

			if (!countMap.containsKey(presentWord)) {
				countMap.put(presentWord, appearances);
			} else {
				countMap.put(presentWord, countMap.get(presentWord) + 1);
			}
		}

		for (int j = 0; j < arr.length; j++) {

			char[] sortedWords = arr[j].toCharArray();
			Arrays.sort(sortedWords);
			String sampleWord = new String(sortedWords);

			if (countMap.containsKey(sampleWord)) {
				System.out.println(arr[j] + " " + countMap.get(sampleWord));
			}
		}

	}
}
