package ˫������;

public class DoubleLink<T> {
    /**
     * Node<AnyType>�ඨ����˫�������нڵ�Ľṹ������һ��˽���࣬ �������Ժ͹��캯�����ǹ��еģ��������丸�����ֱ�ӷ���������
     * ���ⲿ�������֪��Node��Ĵ��ڡ�
     *
     * @author ZHB
     *
     * @param <T>
     *            ����
     * @param Data
     *            �ǽڵ��е�����
     * @param pre
     *            ָ��ǰһ��Node�ڵ�
     * @param next
     *            ָ���һ��Node�ڵ�
     */
    private class Node<T> {
    	//ǰ���
        public Node<T> pre;
        //����
        public Node<T> next;
        //�����������
        public T data;
 
        public Node(T data, Node<T> pre, Node<T> next) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }
 
        public Node() {
            this.data = null;
            this.pre = null;
            this.next = null;
        }
    }
 
    // ������DoubleLinkedList������ݳ�Ա�ͷ���
    private int theSize;//�ܹ������
    private Node<T> Header;//ͷ�ڵ�
    private Node<T> Tail;//β�ڵ�
    /*
     * ���캯�� ���ǹ�����һ������ͷ��β�ڵ��˫������ ͷ�ڵ��Nextָ��β�ڵ� Ϊ�ڵ��preָ��ͷ�ڵ� ��������ʼΪ0��
     */
    public DoubleLink(){
 
        theSize = 0;
        Header = new Node<T>(null, null, null);
        Tail = new Node<T>(null, Header, null);
 
        Header.next = Tail;
    }
 
    public void add(T item) {
        Node<T> aNode = new Node<T>(item, null, null);
        Tail.pre.next = aNode;
        aNode.pre = Tail.pre;
        aNode.next = Tail;
        Tail.pre = aNode;
        theSize++;
    }
 
    public boolean isEmpty() {
        return (this.theSize == 0);
    }
 
    public int size() {
        return this.theSize;
    }
 
    public T getInt(int index) {
 
        if (index > this.theSize - 1 || index < 0)
            throw new IndexOutOfBoundsException();
 
        Node<T> current = Header;
 
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
 
        return current.data;
    }
 
    public void print() {
 
        Node<T> current = Header.next;
 
        while (current.next != null) {
 
            System.out.println(current.data.toString());
 
            current = current.next;
        }
 
    }
 
    public static void main(String[] args) {
        DoubleLink<String> dLink = new DoubleLink<String>();
 
        dLink.add("zhb");
        dLink.add("zzb");
        dLink.add("zmy");
        dLink.add("zzj");
 
        System.out.println("size : " + dLink.size());
        System.out.println("isEmpty? : " + dLink.isEmpty());
        System.out.println("3 : " + dLink.getInt(3));
        dLink.print();
    }
}