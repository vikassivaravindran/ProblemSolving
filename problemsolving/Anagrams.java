package com.datastructures.sorting;

import java.util.Scanner;

public class Anagrams {

	//Java program to check if the Two Strings are Anagrams.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String first = sc.nextLine();
		System.out.println("Enter the Second String:");
		String second = sc.nextLine();
		checkForAnagrams(first, second);
		sc.close();
	}

	private static void checkForAnagrams(String first, String second) {

		boolean temp = false;

		if (first.length() != second.length()) {
			return;
		}

		char[] One = first.toCharArray();
		for (char c : One) {
			if (second.indexOf(c) == -1) {
				temp = true;
				break;
			}
		}
		if (!temp) {
			System.out.println("The Two Strings are Anagrams");
		} else {
			System.out.println("The Two Strings are not Anagrams");
		}
	}
}
