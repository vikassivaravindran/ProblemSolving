package com.vikas.practice;

public class LinkedListReverse {

	/* Java Program to reverse a Linked List using Recursion*/
	
	
	static class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	public LinkedListReverse(int data) {
		root = new Node(data);
	}

	static Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListReverse singleList = new LinkedListReverse(10);
		root.next = new Node(20);
		root.next.next = new Node(30);
		root.next.next.next = new Node(40);
		Node result = reverseaLinkedList(root, null);
		
		while(result != null){
			System.out.print(result.data+"->");
			result = result.next;
		}
	}

	private static Node reverseaLinkedList(Node current, Node prev) {
		// TODO Auto-generated method stub
		if (current.next == null) {

			current.next = prev;
			root = current;
			return root;
		}
		
		Node next = current.next;
		current.next = prev;
		reverseaLinkedList(next, current);
		return root;
	}

}
