package 知先和中序求后序二叉树;

public class BinaryTree {
	private Node root;
	//传入递归程序根节点
	public void postOrder(){
		this.postOrder(root);
	}
	//递归后序遍历
	public void postOrder(Node root){
		if(root!=null){
			//遍历左子树
			postOrder(root.left);
			//遍历右子树
			postOrder(root.right);
			//输出根节点
			System.out.print(root.data+" ");
		}
	}
	//初始化二叉树，返回一个结点
	public void initTree(int[]pre,int[]in){
		this.root=initTree(pre,0,pre.length-1,in,0,in.length-1);
	}
	public Node initTree(int[]pre,int start1,int end1,int[]in,int start2,int end2){
		if(start1>end1||start2>end2){
			return null;
		}
		int rootData=pre[start1];
		Node head =new Node(rootData);
		//在中序遍历中找到根节点所在的位置
		int index = index(rootData,in,start2,end2);
		int offSet = index-start2-1;
		//递归构建左子树
		Node left=initTree(pre,start1+1,offSet+start1+1,in,start2,offSet+start2);
		//递归构建右子树
		Node right=initTree(pre,offSet+start1+2,end1,in,index+1,end2);
		head.left=left;
		head.right=right;
		return head;
	}
	public int index(int rootData,int[] in,int begin,int end){
		for(int i=begin;i<=end;i++){
		if(in[i]==rootData)
		return i;	
		}
		return -1;
	}
	
	public static void main(String[] args) {
		BinaryTree bt =new BinaryTree();
		int[] preOrder={1,2,4,8,9,5,10,3,6,7};
		int[] inOrder={8,4,9,2,10,5,1,6,3,7};
		bt.initTree(preOrder, inOrder);
		System.out.println("二叉树的后序遍历");
		bt.postOrder();
	}
}
