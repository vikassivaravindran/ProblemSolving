package com.vikas.official;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String args[]) {

		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 6, 7, 8, 9, 10 };
		a = rotateArrayClockwise(a, 4);
		b = rotateArrayAntiClockwise(b, 4);
		System.out.println("Clockwise Rotate:::" + Arrays.toString(a) + " " + "Anti-Clockwise Rotate::::" + Arrays.toString(b));
	}

	
	// Method to do Anti-Clockwise Rotate
	private static int[] rotateArrayAntiClockwise(int[] b, int rotations) {
		// TODO Auto-generated method stub
		int k;
		for (int i = 0; i < rotations; i++) {
			int second = b[b.length - 1];

			for (k = b.length - 1; k > 0; k--) {
				b[k] = b[k - 1];
			}
			b[k] = second;
		}
		return b;
	}

	// Method to do Clockwise Rotate
	private static int[] rotateArrayClockwise(int[] a, int n) {
		// TODO Auto-generated method stub
		int j;
		for (int i = 0; i < n; i++) {

			int first = a[0];
			for (j = 0; j < a.length - 1; j++) {

				a[j] = a[j + 1];

			}
			a[j] = first;
		}
		return a;
	}

}
