/**
 * 
 */
package com.vikas.official;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Vikas Siva Ravindran
 *
 */
public class StringParsing {

	// Salesforce sample problem.
	// Sample Input : india is a country
	// Output : A is india country
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your String");
		String in_String = sc.nextLine();
		
		String[] splittedWords = in_String.split(" ");
		int total_size = splittedWords.length;
		splittedWords = arrangeByLength(splittedWords);
		int i = 0;
		String output = splittedWords[i].substring(0, 1).toUpperCase()+splittedWords[i].substring(1);
		System.out.println("First::::"+output);
		
		for(int j = 1 ; j < total_size; j++){
			output = output.concat(" ").concat(splittedWords[j]);
		}
		System.out.println("Second:::"+output);
	}

	private static String[] arrangeByLength(String[] splittedWords) {
		// TODO Auto-generated method stub
		Arrays.sort(splittedWords, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}
	});
		return splittedWords;
	}

}
