package ��������;
/*
 * ��Ŀ�����дһ��������ʹ�����ɾ��ĳ�������и����ģ���ĩβ���ڵ㣬�㽫ֻ������Ҫ��ɾ���Ľڵ㡣
 * 
 * ˼·��ǰ��ڵ������໥�滻��ָ������ָ��
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
