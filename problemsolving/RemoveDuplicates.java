package com.datastructures.sorting;

import java.util.Scanner;

// Java program that takes a String input and returns only characters that have appeared once. i.e Unique Characters

public class RemoveDuplicates {

	public static void main(String[] args) {

		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean b = false;
		StringBuilder sb = new StringBuilder();
		char chars[] = s.toCharArray();
		int size = chars.length;
		sc.close();
		int i, j;

		for (i = 0; i <= size - 1; i++) {

			for (j = 0; j <= size - 1; j++) {

				if (chars[i] == chars[j] && i != j) {
					b = true;
					break;
				}

			}
			if (!b) {
				sb.append(chars[i]);
			}
			b = false;
		}
		if (sb.length() != 0) {
			System.out.println(sb);
		} else {
			System.out.println("The String has no unique characters");
		}
	}
}