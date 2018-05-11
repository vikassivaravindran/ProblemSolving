package com.datastructures.sorting;

import java.util.HashMap;

public class TwoSumII {

	
	//Provides HashMap Implementation for finding the Indexes of two numbers that add up to a particular value in a target in sorted array.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 2 , 3, 4 };

		int size = arr.length;

		int low = 0;
		int high = size - 1;

		int sumofAll[] = searchSumofElements(arr, low, high, 6);
		System.out.println(sumofAll[0] + "," + sumofAll[1]);

	}

	private static int[] searchSumofElements(int[] arr, int low, int high, int i) {

		int[] result = new int[2];
		int k = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (k = 0; k <= high; k++) {

			if (!hm.containsKey(i - arr[k])) {
				hm.put(arr[k], k + 1);
			} else {
				result[1] = k+1;
				result[0] = hm.get(i - arr[k]);
				break;
			}
		}
		return result;
	}
}