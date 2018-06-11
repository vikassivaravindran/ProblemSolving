
public class CheckBST {

	// Java program to check if a tree is a Binary Search Tree 

	static class Node {

		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}

	}

	Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBST tree = new CheckBST();
		tree.root = new Node(10);
		tree.root.left = new Node(5);
		tree.root.left.right = new Node(7);
		tree.root.right = new Node(15);
		tree.root.left.left = new Node(2);
		tree.root.right.left = new Node(12);
		tree.root.right.right = new Node(20);

		if (checkforBinarySearchTree(tree.root)) {
			System.out.println("Is a BST");
		} else {
			System.out.println("Not a BST");
		}

	}

	private static boolean checkforBinarySearchTree(Node treeNode) {
		// TODO Auto-generated method stub
		return checkforBST(treeNode);
	}

	private static boolean checkforBST(Node treeNode) {
		// TODO Auto-generated method stub
		if (treeNode == null) {
			return true;
		}

		if ( (treeNode.left!=null && treeNode.left.data > treeNode.data) || (treeNode.right!=null && treeNode.right.data < treeNode.data) ) {
			return false;
		}
		return checkforBST(treeNode.left) && checkforBST(treeNode.right);
	}
}
