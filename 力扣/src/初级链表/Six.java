package 初级链表;
/*
 * 问题：给定一个链表，判断是否有环
 * 
 * 思路：快慢指针，快指针每次走两步，慢指针每次走一步，相遇则有环
 * */
public class Six {
	//给链表加上一个环
	public void huan(Node root){
		Node tmp=null;
		while(root.next!=null){
			tmp=root;
			root = root.next;
		}
		root.next=tmp;		
	}
	public Boolean search(Node root){
		Node quick = root;
		Node slow = root;		
		while(quick!=null&&quick.next!=null){
			quick = quick.next.next;
			slow = slow.next;
			if(slow==quick){
				return true;
			}
		}
		//快指针走到末尾，没有环存在
		return !(quick==null||quick.next==null);
	}
	
	public static void main(String[] args) {
		Node node4 = new Node(4,null);
		Node node3 = new Node(3,node4);
		Node node2 = new Node(2,node3);
		Node node1= new Node(1,node2);
		Six six =new Six();
		six.huan(node1);
		Node root = node1;
		System.out.println(six.search(node1));
	}

}
