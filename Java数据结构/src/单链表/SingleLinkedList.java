package 单链表;
public class SingleLinkedList implements List{

	private Node head = new Node();//头结点，不存储数据，为了编程方便
	
	private int size;//一共有几个结点
	
	@Override
	public int size() {
		
		return size;
	}

	@Override
	public Object get(int i) {
		//可就和顺序表不一样了,不能通过索引直接计算定位，而需要从头结点开始进行查找
		Node p = head;
		for(int j = 0;j<=i;j++){
			p = p.next;
		}
		return p.data;
	}

	@Override
	public boolean isEmpty() {
		
		return size ==0;
	}

	@Override
	public boolean contains(Object e) {
		Node p = head.next;
		for(int i=0;i<size;i++){
			if(p.data.equals(e)){
				return true;
			}
			//移动指针到下一个结点
			p  = p.next;
		}
		return false;
	}

	@Override
	public int indexOf(Object e) {
		Node p = head.next;
		for(int i=1;i<=size;i++){
			if(p.data.equals(e)){
				return i;
			}
			//移动指针到下一个结点
			p  = p.next;
		}
		throw new MyArrayIndexOutOfBoundsException("未在线性表中找到相关元素");
	}

	@Override
	public void add(int i, Object e) {
		
		//如果i位置错误报异常
		if(i <0  || i> size){
			throw new MyArrayIndexOutOfBoundsException("数组指针越界异常："+i);
		}
		
		//找到前一个结点，从head结点开始
		Node p = head;
		for(int j = 0;j<i;j++){
			p = p.next;
		}
		//新创建一个结点
		//Node newNode = new Node(e);
		Node newNode = new Node();
		newNode.data = e;
		//newNode.next = null;
		//指明新结点的直接后继结点
		newNode.next = p.next;
		
		//指明新结点的直接前驱结点
		p.next = newNode;
		
		//size++
		size++;
	}

	@Override
	public void add(Object e) {
		this.add(size, e);
		
	}

	@Override
	public boolean addBefore(Object obj, Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAfter(Object obj, Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int i) {
		Node p = head;
		//遍历链表找到第i-1个结点
		for(int j=0;j<i-1;j++){
			p=p.next;
		}
		Object data = p.next.data;
		p.next=p.next.next;
		size--;
		return data;
	}

	@Override
	public boolean removeB(Object e) {
		Node p = head.next;
		Node pp = head;
		//遍历链表找到结点值
		for(int j=1;j<size;j++){
	
			if(p.data.equals(e)){
				System.out.println(j);
				//找到前一个结点
				for(int i=0;i<j-1;i++){
					pp=pp.next;
				}
				System.out.println(pp.data);
				pp.next=p.next;
				size--;
				return true;
			}
			p=p.next;
		}
		return false;
	}

	@Override
	public Object replace(int i, Object e) {
		Node p = head;
		//遍历链表找到第i-1个结点
		for(int j=0;j<i;j++){
			p=p.next;
		}
		p.data=e;
		return p.data;
	}
	
	@Override
	public String toString() {
		if(size == 0){
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		Node p = head.next;
		for(int i=0;i<size;i++){
			if(i !=size -1){
				builder.append(p.data+",");
			}else{
				builder.append(p.data);
			}
			//移动指针到下一个结点
			p  = p.next;
			
		}
		builder.append("]");
		return builder.toString();
	}

}
