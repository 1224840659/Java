package ������;

import java.util.LinkedList;

import javax.swing.tree.TreeNode;

import ������.One.Node;

/*
**���⣺����һ����������������Ƿ��Ǿ���ԳƵġ�
*/
public class Three {
	//˼�룺����Գ���Ҫ����������������
    public boolean isSymmetric1(Node root) {      
          //�ݹ�
          if(root==null) return true;
          return isSymmetric(root.left,root.right);
      }
       public boolean isSymmetric(Node r,Node t){
           if (r==null&&t==null) return true;
           if(r==null||t==null) return false;
           if(r.data!=t.data) return false;
           return isSymmetric( r.left, t.right)&&isSymmetric( r.right, t.left);
       }
       
       //����2��������˼��

    public boolean isSymmetric(Node root) {
       if(root==null) return true;
       LinkedList<Node> queue1=new LinkedList<>();
       LinkedList<Node> queue2=new LinkedList<>();
       queue1.add(root.left);
       queue2.add(root.right);
       while(!queue1.isEmpty()&&!queue2.isEmpty()){
    	   Node v1=queue1.poll();
           Node v2=queue2.poll();
           if(v1==null&&v2==null) continue;
           if(v1==null||v2==null){
               return false;
           }else if(v1.data!=v2.data){
               return false;
           }else{
               queue1.add(v1.left);
               queue2.add(v2.right);
               queue1.add(v1.right);
               queue2.add(v2.left);
           }         
       }
       return true;
}

	public static void main(String[] args) {
		Node node5 = new Node(4,null,null);
		Node node4 = new Node(4, null, null);
		Node node3 = new Node(5, null, node5);
		Node node2 = new Node(5, node4, null);	
		Node node1 = new Node(3,node2,node3);
		Three three = new Three();
		System.out.println(	three.isSymmetric(node1));
		
	}

}
