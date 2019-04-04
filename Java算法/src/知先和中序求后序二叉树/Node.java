package 知先和中序求后序二叉树;

public class Node {
	public int data;
	Node left;
	Node right;
	
	public Node() {
		super();
	}

	public Node(int data) {
		super();
		this.data = data;
	}

	public Node(int data, Node left, Node right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
