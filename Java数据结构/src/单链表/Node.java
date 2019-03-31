package 单链表;
/**
 * 单链表的结点 
 * @author Administrator
 *
 */
public class Node {

//	private Object data;//要存储的数据
//	private  Node  next;
	Object data;//要存储的数据
	Node  next;//创建一个引用，指向一个新的Node
	public Node() {
		
	}
	public Node(Object data) {
		super();
		this.data = data;
	}
	public Node(Object data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
