package 二叉树结点的最大距离;


public class MaxDistance {
	
	public int maxDistance;

	public int max(int a,int b){
		return a>=b?a:b;
	}
	public void findMaxdistane(Node root){
		if(root==null){
			return;
		}
		if(root.left==null){
			root.leftMaxDistance=0;
		}
		if(root.right==null){
			root.rightMaxDistance=0;
		}
		if(root.left!=null){
			findMaxdistane(root.left);
		}
		if(root.right!=null){
			findMaxdistane(root.right);
		}
		//左子树到根节点的最大距离
		if(root.left!=null){
			root.leftMaxDistance=max(root.left.leftMaxDistance,root.left.rightMaxDistance)+1;
		}
		//右子树到根节点的最大距离
		if(root.right!=null){
			root.rightMaxDistance=max(root.right.leftMaxDistance,root.right.rightMaxDistance)+1;
		}
		//所有结点之间的最大距离
		if(root.leftMaxDistance+root.rightMaxDistance>maxDistance){
			maxDistance=root.leftMaxDistance+root.rightMaxDistance;
		}  
	}
	public static void main(String[] args) {
		Node node5 = new Node(5, null, null);
		Node node4 = new Node(4, null, node5);
		Node node3 = new Node(3, null, null);
		Node node7 = new Node(7, null, null);
		Node node6 = new Node(6, null, node7);
		Node node2 = new Node(2, node3, node6);
		Node node1 = new Node(1,node4,node2);
		MaxDistance md=new MaxDistance();
		md.findMaxdistane(node1);
		System.out.println(md.maxDistance);
	}
}
