package com.vikas.problemsolving;

import java.util.Stack;

public class MaxStacksProblem {

	Stack<Integer> myStack = new Stack<Integer>();
	Stack<Integer> maxStack = new Stack<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java Sample Program to find the Maximum Value of Two Stacks");
		MaxStacksProblem maxStacks = new MaxStacksProblem();
		maxStacks.push(4);
		maxStacks.push(19);
		System.out.println(maxStacks.pop());
		System.out.println("The Maximum Element Present of the Stack:::" + maxStacks.max());
		maxStacks.push(7);
		System.out.println("The Maximum Element Present of the Stack:::" + maxStacks.max());
		maxStacks.push(14);
		maxStacks.push(200);
		maxStacks.push(20);
		System.out.println("The First Popped Element is::");
		System.out.println(maxStacks.pop());
		System.out.println("The Top Most Element in Original Stack:::" + maxStacks.peek());
		System.out.println("The Maximum Element Present of the Stack:::" + maxStacks.max());
	}

	public void push(int x) {

		if (!maxStack.isEmpty() && maxStack.peek() >= x) {
			myStack.push(x);
		} else {
			myStack.push(x);
			maxStack.push(x);
		}
	}

	public int pop() {
		if (myStack.peek() == maxStack.peek()) {
			maxStack.pop();
		}
		return myStack.pop();
	}

	public int peek() {
		return myStack.peek();
	}

	public int max() {
		if (maxStack.isEmpty()) {
			return 0;
		}
		return maxStack.peek();
	}

	public int search() {

		myStack.search(2);

		return 0;

	}

}
