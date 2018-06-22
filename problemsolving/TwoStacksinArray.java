package com.datastructure.packages;

//import java.util.Stack;

// Java program to implement Two Stacks in a Array

public class TwoStacksinArray {

	int arr[];
	int start;
	int last;
	int count;

	public TwoStacksinArray(int size) {
		arr = new int[size];
		start = 0;
		last = arr.length - 1;
		count = size;
	}

	public void pushStack1(int x) {

		if (last > start) {
			arr[start++] = x;
		}

	}

	public void pushStack2(int y) {
		if (last > start) {
			arr[last--] = y;
		}

	}

	public static void main(String args[]) throws Exception {

		TwoStacksinArray t = new TwoStacksinArray(10);
		t.pushStack1(10);
		t.pushStack1(20);
		t.pushStack1(30);
		t.pushStack2(50);
		t.pushStack2(70);
		System.out.println(t.popStack1());
		System.out.println(t.popStack2());
		t.pushStack1(45);
		System.out.println(t.popStack1());
		System.out.println(t.popStack2());
		System.out.println(t.popStack2());
	}

	private int popStack1() throws Exception {
		// TODO Auto-generated method stub
		start--;
		if (start > 0) {
			return arr[start];
		}
		throw new Exception("No elements to pop");
	}

	private int popStack2() throws Exception {

		last++;
		if (last < count) {
			return arr[last];
		}
		throw new Exception("No elements to pop");
	}
}
