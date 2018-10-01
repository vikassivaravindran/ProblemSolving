/**
 * 
 */
package com.leetcode.problems;

/**
 * @author Vikas Siva Ravindran
 *
 */
public class MedianFinder {

	/**
	 * @param args
	 */
	// Java Program to return the length of the SubArray that has the median value greater than or equal to the specifed value X
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 6 };
		int start = 0;
		int n = a.length;
		int end = n - 1;
		int output = findMedian(a, 3, start, end, n);
		System.out.println(output);

	}

	private static int findMedian(int[] a, int x, int start, int end, int length) {
		// TODO Auto-generated method stub
		double median = 0;

		for (int i = start; i <= end; i++) {

			if (length % 2 != 0) {
				median = a[length / 2];
			} else {
				median = (a[(length / 2)] + a[(length / 2) - 1]) / 2.0;
			}

			if (median < x) {
				start++;
				int[] result = new int[length - 1];
				for (int j = 0; j < result.length; j++) {
					result[j] = a[j + 1];
				}
				median = findMedian(result, x, start, end, result.length);
				break;
			} else {
				return a.length;
			}
		}
		return (int) median;
	}
}
