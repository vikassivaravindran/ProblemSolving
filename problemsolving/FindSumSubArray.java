/**
 * 
 */
package com.leetcode.problems;

/**
 * @author Vikas Siva Ravindran
 *
 */
public class FindSumSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = { 1, 2, 3, 7, 11 };
		int result[] = getIndexofSum(numbers, numbers.length, 21);
		System.out.println(result[0]+" "+result[1]);
	}

	// Java method to return idex of subarray start and end which sums up to the defined Sum.
	// O(n2) time complexity Worst case
	private static int[] getIndexofSum(int[] numbers, int length, int total) {
		// TODO Auto-generated method stub

		int[] output = new int[2];

		int sum_so_far = 0;

		for (int i = 0; i <= numbers.length - 1; i++) {

			sum_so_far = 0;
			
			for (int j = i; j <= numbers.length - 1; j++) {

				sum_so_far += numbers[j];

				if (sum_so_far == total) {
					output[0] = i;
					output[1] = j;
					return output;
				}
				if(sum_so_far > total){
					break;
				}
			}

		}
		output[0] = 0;
		output[1] = 0;
		return output;
	}
}
