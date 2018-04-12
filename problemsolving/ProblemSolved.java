package com.problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProblemSolved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Java program to get an array of elements and identify the maximum distance between the duplicate elements.

		System.out.println("Enter the number of elements");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> difference = new ArrayList<>();
		for (int i = 0; i < d; i++) {
			list.add(sc.nextInt());
		}
		for(Integer number: list){
			int value = list.lastIndexOf(number) - list.indexOf(number);
			difference.add(value);
		}
			int result = Collections.max(difference);
			System.out.println(result-1);
		}
	}

