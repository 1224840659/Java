package 初级链表;
/*
 * 问题：删除链表的倒数第N个节点，并且返回链表的头节点
 * 
 * 思路：快慢指针，快指针先移动N-1步，
 * */
public class Two {
	//找到倒数第N个元素
	public Node search(Node root,int n){
		Node quick = root;
		Node slow = root;
		for(int i=0;i<n;i++){
			quick=quick.next;
		}
		while(quick!=null){
			quick=quick.next;
			slow= slow.next;
		}
		return slow;
	}
	//删除第N个元素
	public void delete(Node root){
		Node tmp = root.next;
		root.data = tmp.data;
		root.next=tmp.next;
	}
	public static void main(String[] args) {
		Node node5= new Node(5,null);
		Node node4 = new Node(4,node5);
		Node node3 = new Node(3,node4);
		Node node2 = new Node(2,node3);
		Node node1= new Node(1,node2);
		Two two = new Two();
		Node node=two.search(node1, 4);
		System.out.println(node.data);
		two.delete(node);
		Node root =node1;
		while(root!=null){
			System.out.print(root.data+" ");
			root = root.next;
		}

	}

}
