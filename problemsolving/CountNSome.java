/**
 * 
 */
package com.vikas.official;

/**
 * @author Vikas Siva Ravindran // Java program to detect the N-some character
 *         sequence. // Consider "eddqrtyyuuunnbbg" where dd,yy,uu,uu,nn,bb -->
 *         6 pairs of 2 consecutive characters found in string
 */
public class CountNSome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = checkStringNSomeMethod("xyxxxwqazazza", 2);
		System.out.println(value);
	}

	private static int checkStringNSomeMethod(String string, int n) {
		// TODO Auto-generated method stub
		/*
		 * METHOD 1 - USING TWO FOR LOOPS
		 * 
		 * int i = 0; int countFlag = 0; char[] result = string.toCharArray();
		 * while (i <= result.length - n) {
		 * 
		 * int limit = i+(n-1); //limit = 2
		 * 
		 * int appearanceCount = 1; for (int j = i; j < limit; j++) {
		 * 
		 * if (result[j] == result[j + 1]) { appearanceCount ++; } else{ break;
		 * } } i++; if (appearanceCount == n) { countFlag++; } } return
		 * countFlag; }
		 * 
		 * 
		 * 
		 */
		
		/* ------------------------------------------------------*/
		// USING A SINGLE FOR-LOOP
		
		
		char result[] = string.toCharArray(); // aaabwww

		int countFlag = 0;
		int appearanceCount = 1;

		for (int i = 0; i <= string.length() - n; i++) {

			int j = i + 1;
			if (result[i] == result[j++]) {
				appearanceCount++;
			} else {
				continue;
			}

			if (appearanceCount == n) {
				countFlag++;
				appearanceCount = 1;
			}
		}
		return countFlag;
	}
}
