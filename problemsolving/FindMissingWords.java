/**
 * 
 */
package com.vikas.problemsolving;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikas Siva Ravindran
 *	Java Program to check if a String contains certain words 
 *	hackerrank solution
 */
public class FindMissingWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "I am using hackerrank to learn programming";
		String s2 = "I am vikas using hackerrank to learn";

		//System.out.println(findMissingWords(s1, s2));
		checkAnotherMethod(s1, s2);

	}

	/**
	 * @param s1
	 * @param s2
	 */
	private static void checkAnotherMethod(String s1, String s2) {
		// TODO Auto-generated method stub

		List<String> words = new ArrayList<>();

		String a[] = s1.split(" ");

		for (String x : a) {
			if (!s2.contains(x)) {
				words.add(x);
			}
		}

		System.out.println(words);
	}

	/**
	 * @param s1
	 * @param s2
	 */
	/*private static List<String> findMissingWords(String s1, String s2) {
		// TODO Auto-generated method stub

		String[] a = s1.split(" ");
		String[] b = s2.split(" ");

		String s3 = "vikas";
		String s4 = "rishi";

		if (s3 == s4) {
			System.out.println("I am Equal");
		} else {
			System.out.println("I am Not Equal");
		}

		boolean flag = false;
		List<String> missingWords = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {

			flag = false;

			for (int j = 0; j < b.length; j++) {
				if (!a[i].equals(b[j])) {
					continue;
				} else {
					flag = true;
					break;
				}
			}
			if (!flag) {
				missingWords.add(a[i]);
			}
		}

		return missingWords;
	}
*/
}
