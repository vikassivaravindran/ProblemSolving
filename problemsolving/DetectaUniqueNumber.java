/**
 * 
 */
package com.vikas.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * @author Vikas Siva Ravindran
 *
 */
public class DetectaUniqueNumber {

	/**
	 * @param args
	 */
	/*Java program to find the element that occurs only once in the arrays*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,2,3,1,1};
		int result = detecttheNumber(a,a.length);
		System.out.println(result);
	}

	private static int detecttheNumber(int[] a, int length) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> p =new HashMap<>();
		int count  = 1;
			for(int i: a) {
				if(p.containsKey(i)){
					p.put(i, p.get(i)+1);
				}else{
				p.put(i, count);
				}
			}
			for(Entry<Integer,Integer> value: p.entrySet()){
				if(value.getValue().equals(1)){
					return value.getKey();
				}
			}
			return 0;
	}	

}
