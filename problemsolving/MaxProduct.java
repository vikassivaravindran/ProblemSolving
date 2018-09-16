/**
 * 
 */
package com.vikas.practice;

/**
 * @author Vikas Siva Ravindran
 *
 */
public class MaxProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 8, 7, 3 };
		int b[] = {1,2,8,7,3};
 
		int result[] = maxProduct(a);
		System.out.println("The Product is::"+result[0]+" "+result[1]);
	}

	private static int[] maxProduct(int[] a) {

		/*int max1 = Integer.MIN_VALUE;
		int max2 = 0;
		for (int i = 0; i < a.length; i++) {
              int max2;
			int temp = max1;

			if (a[i] > temp) {
				max1 = a[i];
				{
					if(b[i]> temp && b[i]!==max1)
						b[i]=max2;
						
				}
			}

		}*/
		int output[] = new int[2];
		int max1 = Integer.MIN_VALUE;
		int max2 = 0;
		
		for(int i = 0; i< a.length; i++){
			
			if(a[i] > max1){
				max2 = max1;
				max1 = a[i];
			}
			else if(a[i] > max2){
				max2 = a[i];
			}
			
		}
		output[0] = max1;
		output[1] = max2;
		return output;
	}

}
