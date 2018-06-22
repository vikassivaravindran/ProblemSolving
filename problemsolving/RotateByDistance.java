package com.datastructure.trees;

import java.util.Arrays;

public class RotateByDistance {
	
	// Java program to rotate an Array
	
	public static void main(String args[]) {
		
		int numbers[] = new int[] {1,2,3,4,5};
		int size = numbers.length;
		
		rotateArray(numbers,size,2);
		
	}

	private static void rotateArray(int[] numbers, int size, int count) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < count ; i++) {
			
			int lastNumber = size - 1;
			int previous = numbers[lastNumber]; //previous = 5
			
			for(int j  = 0; j <size ; j++) {
				
				int current = numbers[j];  //current = 1
  				numbers[j] = previous;     // numbers[j] = 5
				previous = current;        //previous = 1 
			}
			
		}
		
		System.out.println("The Numbers are:"+Arrays.toString(numbers));
	}

}
