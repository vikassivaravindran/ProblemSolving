/**
 * 
 */
package com.vikas.problemsolving;

/**
 * @author Vikas Siva Ravindran
 *
 */
public class StackUsingArrays {

	
	// Java Sample Program to implement functionalities of a Stack Data Structure using Arrays
	public int arr[];
	int top;
	int length;

	public StackUsingArrays(int size) {
		arr = new int[size];
		top = -1;
		this.length = size;
	}

	public void push(int x) {
		if (top == length - 1) {
			System.out.println("The Array size is full");
			return;
		}
		arr[++top] = x;
	}

	public int pop() {
		if (top == length - 1) {
			System.out.println("The Array is Empty");
			return 0;
		}
		return arr[top--];
	}

	public int peek() {
		if (top == -1) {
			System.out.println("The Array is Empty");
			return 0;
		}
		return arr[top];
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArrays scArrays = new StackUsingArrays(5);
		scArrays.push(10);
		scArrays.push(20);
		scArrays.push(30);
		scArrays.push(40);
		scArrays.push(50);
		scArrays.push(60);
		int poppedElement = scArrays.pop();
		int poppedElement1 = scArrays.pop();
		int poppedElement2 = scArrays.pop();
		int poppedElement3 = scArrays.pop();

		System.out.println(poppedElement + " " + poppedElement1 + " " + poppedElement2+" "+poppedElement3);
		if (scArrays.isEmpty()) {
			System.out.println("The Array is Empty");
		} else {
			System.out.println("The Array is not empty");
		}
		System.out.println(scArrays.peek());
		scArrays.push(50);
		System.out.println(scArrays.pop());

	}

}
