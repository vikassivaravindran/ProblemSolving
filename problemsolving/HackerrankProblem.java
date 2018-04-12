package com.problemsolving;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * 
 * @author vikas.sivaravindran
 *	hacker ranker sample problem
 *
 *	3
 *  5 44 12 11 22 33
 *  1 12
 *  2 55 66
 *  5 
 *  1 1
 *  0 1
 *  0 2 
 *
 *
 *
 */
public class HackerrankProblem {

	public static void main(String[] args) {
		int row = 0;
		int column = 0;

		System.out.println("Enter the number of records");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();

		ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
		for (int i = 0; i < d; i++) {
			System.out.println("Enter the number of records in the"+i +"row:");
			int n = sc.nextInt();
			ArrayList<Integer> values = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				values.add(sc.nextInt());
			}
			rows.add(values);	
		}
		System.out.println("Please Enter the queries:");
		int s = sc.nextInt();
		for(int m = 0; m < s ; m++){
		System.out.print("Enter the required row and column of row:"+ (m+1));
			 row = sc.nextInt();
			 column = sc.nextInt(); 
			ArrayList<Integer> finalList = rows.get(row);
		    System.out.println(finalList.get(column));
		}
	}
	 
}
