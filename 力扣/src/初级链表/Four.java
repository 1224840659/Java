package 初级链表;
/*
 * 问题：将两个有序链表合并为一个有序链表，重复元素不删除。
 * 		新链表是通过拼接给定两个链表的所有节点组成的。
 * */
public class Four {
	//递归
	public Node merge(Node p1,Node p2){
		Node root;
		if(p1==null) return p2;
		if(p2==null) return p1;
		if(p1.data<p2.data){
			root =p1;
			root.next=merge(p1.next,p2);
		}
		else{ 
			root=p2;
			root.next=merge(p1,p2.next);
		}
		return root;
	}
	public static void main(String[] args) {
		Node node5= new Node(5,null);
		Node node4 = new Node(4,node5);
		Node node3 = new Node(3,node4);
		Node node2 = new Node(2,node3);
		Node node1= new Node(1,node2);
		
		Node node10= new Node(10,null);
		Node node9 = new Node(8,node10);
		Node node8 = new Node(5,node9);
		Node node7 = new Node(3,node8);
		Node node6= new Node(1,node7);
		Four four = new Four();
		Node root=four.merge(node1,node6);
		while(root!=null){
			System.out.print(root.data+" ");
			root=root.next;
		}
	}

}
