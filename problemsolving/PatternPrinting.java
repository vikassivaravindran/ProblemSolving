package com.pattern.printing;

import java.util.Scanner;


/**

Java Program to Print Pattern

Enter the number of rows:
5
    1 
   3 2 
  6 5 4 
 10 9 8 7 
15 14 13 12 11 
15 14 13 12 11 
 10 9 8 7 
  6 5 4 
   3 2 
    1 

**/


public class PatternPrinting {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n = sc.nextInt();
		sc.close();
		int number = 0;

		for (int i = 1; i <= n; i++) {

			number = number + i;

			for (int k = i; k < n; k++) {
				System.out.print(" ");
			}
			int k = number;

			for (int j = 0; j < i; j++) {
				System.out.print(k + " ");
				k--;
			}

			System.out.println();
		}

		for (int m = n; m > 0; m--) {

			for(int k = m; k <n; k++ ) {
				System.out.print(" ");
			}
			
			for (int h = 0; h < m; h++) {
				System.out.print(number+" ");
				number--;
			}
			System.out.println();

		}

	}
}
