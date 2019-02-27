/**
 * 
 */
package com.vikas.java8.lambdas;

/**
 * @author vikas
 *
 */
public class AppearanceCount {

	/**
	 * @param args
	 * Java sample program to print apperance of the character in a string (i.e) aaaabbbb ---->  a4b3
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaa";
		s = checkforCount(s);
		System.out.println(s);

	}

	private static String checkforCount(String s) {
		// TODO Auto-generated method stub
		int size = s.length();
		int count = 1;
		int position = -1;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length() - 1; i++) {

			if (s.charAt(i) != s.charAt(i + 1) && count==1) {
				sb.insert(++position,s.charAt(i));
			} else if(s.charAt(i) == s.charAt(i + 1) ){

				count = count + 1;

				if (count > 2) {
					sb.deleteCharAt(position);
					sb.append(count);
					
				} else {

					sb.insert(++position, s.charAt(i));
					sb.insert(++position,count);
				}

			}else {
				count = 1;
			}

		}

		return sb.toString();
	}

}
