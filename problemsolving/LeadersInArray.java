/**
 * 
 */
package com.vikas.problemsolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Vikas Siva Ravindran Given an array of positive integers. Your task
 *         is to find the leaders in the array. Note: An element of array is
 *         leader if it is greater than or equal to all the elements to its
 *         right side. Also, the rightmost element is always a leader. Geeks for
 *         Geeks Problem
 *
 */

public class LeadersInArray {

	Stack<Integer> s;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] { 7, 4, 5, 7, 3 };
		LeadersInArray leaders = new LeadersInArray();
		leaders.checktheLeaders(a);

	}

	/**
	 * @param a
	 */
	private void checktheLeaders(int[] a) {
		// TODO Auto-generated method stub
		s = new Stack<Integer>();
		int max = Integer.MIN_VALUE;

		for (int i = a.length - 1; i >= 0; i--) {

			if (a[i] >= max) {
				max = a[i];
				s.push(max);
			}

		}
		s.forEach(System.out::println);

	}

}
