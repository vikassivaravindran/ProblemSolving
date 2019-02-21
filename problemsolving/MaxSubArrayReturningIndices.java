package com.vikas.java8.lambdas;

import java.util.Scanner;

public class MaxSubArrayReturningIndices {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Please enter the number of elements in a array");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println();
		int start = 0, end = 0;
		System.out.println("Please Enter the " + size + " elements below");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int[] output = new int[3];
		int[] max_sum = checkMaximumSubArray(arr, 0, arr.length - 1, start, end, output);
		System.out.println("The Contiguous Sum Sub Array ----- " + max_sum[0]);
		System.out.println("Start Index ----- " + max_sum[1]);
		System.out.println("End Index ----- " + max_sum[2]);

	}

	private static int[] checkMaximumSubArray(int[] arr, int low, int high, int start, int end, int result[]) {
		// TODO Auto-generated method stub
		if (low == high) {
			start = low;
			end = high;
			result = new int[3];
			result[0] = arr[low];
			result[1] = start;
			result[2] = end;
			return result;
		}

		int mid = (low + high) / 2;

		int[] left_max = checkMaximumSubArray(arr, low, mid, start, end, result);
		int[] right_max = checkMaximumSubArray(arr, mid + 1, high, start, end, result);
		int total_max = Math.max(left_max[0], right_max[0]);

		if (left_max[0] > right_max[0]) {
			result[0] = left_max[0];
			result[1] = left_max[1];
			result[2] = left_max[2];
		} else {
			result[0] = right_max[0];
			result[1] = right_max[1];
			result[2] = right_max[2];
		}

		int sum = 0;
		int left_sum = Integer.MIN_VALUE;
		for (int i = mid; i >= low; i--) {
			sum = sum + arr[i];
			if (sum > left_sum) {
				left_sum = sum;
				start = i;
			}
			if (left_sum < 0) {
				left_sum = 0;
				start = i + 1;
			}

		}

		sum = 0;
		int right_sum = Integer.MIN_VALUE;
		for (int i = mid + 1; i <= high; i++) {
			sum = sum + arr[i];
			if (sum > right_sum) {
				right_sum = sum;
				end = i;
			}
			if (right_sum < 0) {
				right_sum = 0;
				end--;
			}
		}

		if (total_max > left_sum + right_sum) {
			return result;
		}

		result = new int[3];
		result[0] = left_sum + right_sum;
		result[1] = start;
		result[2] = end;

		return result;
	}

}
