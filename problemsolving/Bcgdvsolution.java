package com.vikas.oopsconcepts;

import java.util.Scanner;
/*
 * Java Program to find the Sum of Numbers and return when the result is less than 10
 */
public class Bcgdvsolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number::");
		int n = sc.nextInt();
		System.out.println("Method1:::" + calculateResult(n));
		System.out.println("Method2:::" + calculateResultByanotherMethod(n));
		sc.close();
	}

	private static int calculateResultByanotherMethod(int n) {
		// TODO Auto-generated method stub
		String number = String.valueOf(n);
		int sum = 0;
		if (number.length() == 1) {
			return n;
		}
		for (int i = 0; i < number.length(); i++) {
			sum = sum + Integer.parseInt(number.substring(i, i + 1));
		}
		return calculateResultByanotherMethod(sum);
	}

	private static int calculateResult(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		if (n < 10) {
			return n;
		} else {
			while (n > 0) {

				sum = sum + (n % 10);
				n = n / 10;
			}
		}
		return calculateResult(sum);
	}

}
