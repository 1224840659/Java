package ��������;
/*
 * ���⣺����һ�������ж��Ƿ��л�
 * 
 * ˼·������ָ�룬��ָ��ÿ������������ָ��ÿ����һ�����������л�
 * */
public class Six {
	//���������һ����
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
		//��ָ���ߵ�ĩβ��û�л�����
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
