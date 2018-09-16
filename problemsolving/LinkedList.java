/**
 * 
 */
package com.vikas.official;
/**
 * @author Vikas Siva Ravindran Java Program to perform 1. Insertion at
 *         Beginning 2. Insertion at End 3. Insertion at Middle 4. Deletion at
 *         Specified Position 5. Deletion at the Beginning 6. Deletion at the End
 Singly Linked List
 */
public class LinkedList {

	static class Node {

		int value;
		Node next;

		public Node(int data) {
			value = data;
		}

	}

	Node head;

	Node LinkedListNode;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		l1.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);

		l1.head.next = second;
		second.next = third;

		printNodesList(l1.head);
		l1.LinkedListNode = addatBeginning(50, l1.head);
		l1.LinkedListNode = addatSpecificPosition(3, l1.LinkedListNode, 70);
		l1.LinkedListNode = addattheEnd(100, l1.LinkedListNode);
		l1.LinkedListNode = deleteattheSpecificPosition(l1.LinkedListNode, 3);
		l1.LinkedListNode = deleteattheBeginning(l1.LinkedListNode);
		l1.LinkedListNode = deleteattheEnd(l1.LinkedListNode);
	}

	private static Node deleteattheEnd(Node linkedListfinalNode) {
		// TODO Auto-generated method stub
		Node resultNode = linkedListfinalNode;
		Node previousNode = null;
		while (resultNode.next != null) {
			 previousNode = resultNode;
			resultNode = resultNode.next;
		}
		previousNode.next = null;
		System.out.println();
		System.out.println("After deleting at the End:");
		printNodesList(linkedListfinalNode);
		return linkedListfinalNode;
	}

	private static Node deleteattheBeginning(Node deletedheadNode) {
		// TODO Auto-generated method stub
		Node temp_head = deletedheadNode.next;
		deletedheadNode = null;
		System.out.println();
		System.out.println("After deleting from the front");
		printNodesList(temp_head);
		return temp_head;
	}

	private static Node deleteattheSpecificPosition(Node linkedListNode2, int position) {
		// TODO Auto-generated method stub
		Node head = linkedListNode2;
		for (int i = 1; i < position - 1; i++) {
			head = head.next;
		}
		Node second_Node = head.next.next;
		head.next = second_Node;
		System.out.println();
		System.out.println("After Deleting at the" + position + "nd");
		printNodesList(linkedListNode2);
		return linkedListNode2;
	}

	private static Node addattheEnd(int i, Node mergedNode) {
		// TODO Auto-generated method stub
		Node last_Node = new Node(i);
		Node lastNode = mergedNode;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
		}
		lastNode.next = last_Node;
		System.out.println();
		System.out.println("After Inserting at the End");
		printNodesList(mergedNode);
		return mergedNode;
	}

	private static Node addatSpecificPosition(int position, Node n1, int value) {
		// TODO Auto-generated method stub
		Node temp_middle = new Node(value);
		Node head = n1;

		for (int i = 1; i < position - 1; i++) {
			head = head.next;
		}
		Node sample = head.next;
		head.next = temp_middle;
		temp_middle.next = sample;
		System.out.println();
		System.out.println("After insertion at the middle");
		printNodesList(n1);
		return n1;
	}

	private static Node addatBeginning(int data, Node headNode) {
		// TODO Auto-generated method stub
		Node first = new Node(50);

		if (headNode != null) {

			first.next = headNode;
			headNode = first;
		}
		System.out.println();
		System.out.println("After Insertion at the Beginning");
		printNodesList(headNode);
		return headNode;
	}

	private static void printNodesList(Node headNode) {
		// TODO Auto-generated method stub
		while (headNode != null) {
			System.out.print(headNode.value + "->");
			headNode = headNode.next;
		}

	}

}
