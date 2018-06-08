
public class BinarySearchTree{
	
	// Java program to find node with minimum value in a Binary Tree.
	
	static class Node{
		
		int data;
		Node left;
		Node right;
		
		public Node(int value) {
			data = value;
		}
			
	}
	
	 Node root;
	
	public static void main(String args[]) {
		BinarySearchTree t = new BinarySearchTree();
		t.root = new Node(10);
		t.root.left = new Node(5);
		t.root.right = new Node(15);
		t.root.left.left = new Node(2);
		t.root.left.right = new Node(6);
		t.root.right.left = new Node(12);
		t.root.right.right = new Node(16);
		
		
		int value = searchMinimum(t.root);
		System.out.println("The Minimum Value present in the Binary Search Tree is:::"+value);
		
	}

	private static int searchMinimum(Node minNode) {
		// TODO Auto-generated method stub
		if(minNode.left == null) {
			return minNode.data;
		}
		return searchMinimum(minNode.left);
	
	}

}

