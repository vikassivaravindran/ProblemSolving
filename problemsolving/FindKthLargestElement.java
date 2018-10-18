/**
 * 
 */
package com.vikas.problemsolving;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Vikas Siva Ravindran
 *	Find Kth Largest Element in a Array Using Priority Queue
 */
public class FindKthLargestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 5, 1, 8, 11, 2, 22 };
		System.out.println(findKthLargestElement(a, 3));

	}

	private static int findKthLargestElement(int[] a, int i) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> q1 = new PriorityQueue<>(Comparator.reverseOrder());
		int start = 0, result = 0;
		for (int count = 0; count <= a.length - 1; count++) {
			q1.add(a[count]);
		}

		while (start < i) {
			result = q1.poll();
			start++;
		}

		return result;
	}

}
