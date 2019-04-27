package 初级树;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import 初级树.One.Node;

/*
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
	假设一个二叉搜索树具有如下特征：
	节点的左子树只包含小于当前节点的数。
	节点的右子树只包含大于当前节点的数。
	所有左子树和右子树自身必须也是二叉搜索树。
 * 
 * 
 * */
public class Second {
	//方法1：二叉搜索树的中序遍历一定按照升序排列
	 public boolean isValidBST(Node root) {
	        List<Integer> list = new ArrayList<Integer>();
	        if (root == null) return true;
	        orderBST(root, list);
	        for (int i = 0; i < list.size() - 1; i++) {
	            if (list.get(i) >= list.get(i + 1)) return false;
	        }        
	        
	        return true;
	    }
	 //中序遍历
	    private void orderBST(Node root, List<Integer> list) {
	        if (root == null) return;
	        orderBST(root.left, list);
	        list.add((Integer)root.data);
	        orderBST(root.right, list);
	    }
	
	    
	    
	//方法2：一边遍历一边进行比较，节省时间，平均效率高
	Boolean bo = true;
	Object pre=0;
	public boolean isort(Node root){
		if(root==null){
			return true;
		}
		return isort(root.left)&&compare(root.data)&&isort(root.right);
	}
	public boolean compare(Object val){
		if(bo){
			bo=false;
			pre=val;
			return true;
		}
		if((Integer)val <= (Integer)pre)
			return false;
		pre=val;
		return true;
	}
	
	
	
	public static void main(String[] args) {
//		Node node5 = new Node(1, null, null);
//		Node node4 = new Node(4, null, node5);
//		Node node3 = new Node(3, null, null);
//		Node node7 = new Node(8, null, null);
//		Node node6 = new Node(7, null, node7);
//		Node node2 = new Node(6, node3, node6);	
//		Node node1 = new Node(5,node4,node2);
//		
		Node node5 = new Node(3,null,null);
		Node node3 = new Node(4, node5, null);
		Node node4 = new Node(1, null, null);
		Node node2 = new Node(5, node4, null);	
		Node node1 = new Node(3,node2,node3);
		Second se =new Second();
		System.out.println(se.isValidBST(node1));
		
	}

}
