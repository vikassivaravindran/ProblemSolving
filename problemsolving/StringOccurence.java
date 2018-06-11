package com.datastructure.trees;

public class StringOccurence {

	public static void main(String args[]) {
		
		/** Java Program to find the character that appears maximum number of times**/

		String s = "aaaabbbbbccccccccccc";

		int i = 0;
		int sum = 0;
		char ch = 0; 

		while (i < s.length()) {

			int count = 0;

			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (count > sum) {
				ch = s.charAt(i);
				sum = count;
			}
			i++;
		}
		System.out.println("The Character that appears most number of times is:"+ch);
	}
}
