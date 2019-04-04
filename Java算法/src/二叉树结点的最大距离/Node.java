package 二叉树结点的最大距离;

public class Node {
	public int data;
	Node left;
	Node right;
	public int leftMaxDistance;
	public int rightMaxDistance;
	public Node(int data, Node left, Node right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
