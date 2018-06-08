
public class BinarySearchTree{
	
	// Java program to Search if a value is present in a Binary Tree.
	
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
		
		if(searchElement(6,t.root)) {
			System.out.println("The Value is present");
		}else {
		System.out.println("The Value is not present");
		}
	}

	private static boolean searchElement(int i,Node tNode) {
		// TODO Auto-generated method stub
		if(i == tNode.data) {
			return true;
		}
		if(tNode.left == null || tNode.right == null ) {
			return false;
		}
		
		boolean result = i < tNode.data ? searchElement(i, tNode.left) : searchElement(i, tNode.right);
		return result;
	
	}
}

