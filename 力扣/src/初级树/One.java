package 初级树;

//import 二叉树.Node;

/*	给定一个二叉树，找出其最大深度。
	二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 
 * 
 * */
public class One {
	public static class Node{
		Object data;
		Node left;
		Node right;
		
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

	
	public int search(Node root){
		if(root==null){
			return 0;
		}
		
		int leftHeight=search(root.left);
		int rightHeight=search(root.right);
		if(leftHeight>rightHeight){
			return leftHeight+1;
		}
		else{
			return rightHeight+1;
		}
	}
	
	public static void main(String[] args) {
		//创建一个二叉树

		Node node5 = new Node(5, null, null);
		Node node4 = new Node(4, null, node5);
		Node node3 = new Node(3, null, null);
		Node node7 = new Node(7, null, null);
		Node node6 = new Node(6, null, node7);
		Node node2 = new Node(2, node3, node6);	
		Node node1 = new Node(1,node4,node2);
		One one=new One();
		System.out.println(one.search(node1));
	}

}
