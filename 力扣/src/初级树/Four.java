package 初级树;

import java.util.LinkedList;
import java.util.Queue;

import 初级树.Node;

/*
 *二叉树的层次遍历
 * */
public class Four {
	public void sort(Node root){
		if(root==null)
			return;
		System.out.println("二叉树的层次遍历");
		Queue qe = new LinkedList();
		qe.add(root);
		int len =qe.size();
		while(len!=0){
		for(int i =0;i<len;i++){
			root =(Node)qe.poll();
			System.out.print(root.data+" ");
			if(root.left!=null){
				qe.add(root.left);
				}
			if(root.right!=null){
				qe.add(root.right);
			}
		}
		}
	}
	
//	public static void main(String[] args) {
//
////		Node node5 = new Node(4,null,null);
////		Node node4 = new Node(4, null, null);
////		Node node3 = new Node(5, null, node5);
////		Node node2 = new Node(5, node4, null);	
////		Node node1 = new Node(3,node2,node3);
////		Four fo = new Four();
////		fo.sort(node2);
//
//	}

}
