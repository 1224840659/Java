package 初级树;
import 初级树.Node;
/*
 * 问题：将一个有序数组转换为平衡二叉搜索树
 * 平衡：左右子树的高度相差不大于1
 * 二叉搜索树：左子树<根<右
 * 思想：二叉搜索树的中序遍历是一个有序数组
 * 算法实现：二分查找的思想
 * */
public class Five {
	public Node sort(int[]a,int low,int high){
		
		if(low==high)
			return new Node(a[low]);
			
        if(low > high && high + 1 == low || low == a.length){
            return null;
        }
		int mid = (low+high)/2;
		Node root = new Node(a[mid]);
		root.left=sort(a,low,mid-1);
		root.right=sort(a,mid+1,high);
		return root;		
	}
	//中序遍历
	public void midSort(Node root){
		if(root!=null){
		midSort(root.left);
		System.out.print(root.data+" ");
		midSort(root.right);
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,3,5,6,7,8};
		Five fi= new Five();
		Node root = fi.sort(arr, 0, arr.length-1);
		fi.midSort(root);		
	}
}
