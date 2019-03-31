package ������;
public class SingleLinkedList implements List{

	private Node head = new Node();//ͷ��㣬���洢���ݣ�Ϊ�˱�̷���
	
	private int size;//һ���м������
	
	@Override
	public int size() {
		
		return size;
	}

	@Override
	public Object get(int i) {
		//�ɾͺ�˳���һ����,����ͨ������ֱ�Ӽ��㶨λ������Ҫ��ͷ��㿪ʼ���в���
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
			//�ƶ�ָ�뵽��һ�����
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
			//�ƶ�ָ�뵽��һ�����
			p  = p.next;
		}
		throw new MyArrayIndexOutOfBoundsException("δ�����Ա����ҵ����Ԫ��");
	}

	@Override
	public void add(int i, Object e) {
		
		//���iλ�ô����쳣
		if(i <0  || i> size){
			throw new MyArrayIndexOutOfBoundsException("����ָ��Խ���쳣��"+i);
		}
		
		//�ҵ�ǰһ����㣬��head��㿪ʼ
		Node p = head;
		for(int j = 0;j<i;j++){
			p = p.next;
		}
		//�´���һ�����
		//Node newNode = new Node(e);
		Node newNode = new Node();
		newNode.data = e;
		//newNode.next = null;
		//ָ���½���ֱ�Ӻ�̽��
		newNode.next = p.next;
		
		//ָ���½���ֱ��ǰ�����
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
		//���������ҵ���i-1�����
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
		//���������ҵ����ֵ
		for(int j=1;j<size;j++){
	
			if(p.data.equals(e)){
				System.out.println(j);
				//�ҵ�ǰһ�����
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
		//���������ҵ���i-1�����
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
			//�ƶ�ָ�뵽��һ�����
			p  = p.next;
			
		}
		builder.append("]");
		return builder.toString();
	}

}
