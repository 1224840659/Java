package ��������;

import java.util.Deque;
import java.util.LinkedList;

/*
 * ���⣺��תһ��������
 * 
 * ˼·�������͵ݹ�ķ���
 * */
public class Three {
	//ջʵ��
	public void reserve(Node root){
		Deque<Node> de =new LinkedList<Node>();
		while(root!=null){
			de.push(root);
			root=root.next;
		}
		System.out.println(de.size());
		while(!de.isEmpty()){
			System.out.print(de.pop().data+" ");
		}
	}
	//�ݹ�ʵ��
	public void digui(Node root){
		if(root!=null){
			digui(root.next);
			System.out.print(root.data+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node5= new Node(5,null);
		Node node4 = new Node(4,node5);
		Node node3 = new Node(3,node4);
		Node node2 = new Node(2,node3);
		Node node1= new Node(1,node2);
		Three three =new Three();
//		three.reserve(node1);
		three.digui(node1);
	}

}
