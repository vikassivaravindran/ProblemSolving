package com.vikas.learningtocode;

import java.util.Deque;
import java.util.LinkedList;

/*
 * Java code to do Binary Tree Zig Zag Traversal using Deque data structure.
 */
public class BinaryTreeZigZagTraversal {

	Node root;

	Deque<Node> nodes = new LinkedList<Node>();

	static class Node {

		int data;
		Node right;
		Node left;

		public Node(int x) {
			this.data = x;
		}

	}

	public static void main(String args[]) {

		BinaryTreeZigZagTraversal treeNode = new BinaryTreeZigZagTraversal();
		treeNode.root = new Node(1);
		treeNode.root.left = new Node(2);
		treeNode.root.right = new Node(3);
		treeNode.root.left.left = new Node(4);
		treeNode.root.left.left.left = new Node(11);
		treeNode.root.left.left.right = new Node(12);
		treeNode.root.left.right = new Node(5);
		treeNode.root.right.left = new Node(6);
		treeNode.root.right.right = new Node(7);
		treeNode.root.right.right.left = new Node(13);

		System.out.println();
		treeNode.zigzagLevelOrder(treeNode.root);

	}

	private void zigzagLevelOrder(Node root) {
		// TODO Auto-generated method stub
		nodes.add(root);
		boolean evenLevel = true;
		Node n = null;

		while (!nodes.isEmpty()) {

			int size = nodes.size();
			for (int i = 0; i < size; i++) {

				if (evenLevel) {

					n = nodes.removeLast();

					if (n.left != null) {

						nodes.addFirst(n.left);
					}
					if (n.right != null) {

						nodes.addFirst(n.right);
					}
				} else {

					n = nodes.removeFirst();

					if (n.right != null) {
						nodes.addLast(n.right);
					}
					if (n.left != null) {
						nodes.addLast(n.left);
					}
				}
				System.out.println(n.data);

			}
			evenLevel = !evenLevel;

		}

	}

}
