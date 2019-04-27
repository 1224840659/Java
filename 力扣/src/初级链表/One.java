package 初级链表;
/*
 * 题目：请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 * 
 * 思路：前后节点数据相互替换，指针重新指向
 * */
public class One {
	public void delete(Node root){
		Node tmp = root.next;
		root.data = tmp.data;
		root.next=tmp.next;
	}
	public static void main(String[] args) {
		Node node4 = new Node(4,null);
		Node node3 = new Node(3,node4);
		Node node2 = new Node(2,node3);
		Node node1= new Node(1,node2);
		One one = new One();
		one.delete(node2);
		Node root =node1;
		while(root!=null){
			System.out.print(root.data+" ");
			root = root.next;
		}
		
		

	}

}
