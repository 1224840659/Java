package ������;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ������.One.Node;

/*
 * ����һ�����������ж����Ƿ���һ����Ч�Ķ�����������
	����һ��������������������������
	�ڵ��������ֻ����С�ڵ�ǰ�ڵ������
	�ڵ��������ֻ�������ڵ�ǰ�ڵ������
	�������������������������Ҳ�Ƕ�����������
 * 
 * 
 * */
public class Second {
	//����1���������������������һ��������������
	 public boolean isValidBST(Node root) {
	        List<Integer> list = new ArrayList<Integer>();
	        if (root == null) return true;
	        orderBST(root, list);
	        for (int i = 0; i < list.size() - 1; i++) {
	            if (list.get(i) >= list.get(i + 1)) return false;
	        }        
	        
	        return true;
	    }
	 //�������
	    private void orderBST(Node root, List<Integer> list) {
	        if (root == null) return;
	        orderBST(root.left, list);
	        list.add((Integer)root.data);
	        orderBST(root.right, list);
	    }
	
	    
	    
	//����2��һ�߱���һ�߽��бȽϣ���ʡʱ�䣬ƽ��Ч�ʸ�
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
