package ��������;
/*
 * ���⣺�ж�һ�������Ƿ�Ϊ��������
 * ����: 1->2->2->1���: true
 * ����: 1->2���: false
 * 
 * ˼·������ָ�룬�ҵ��м�ڵ㣬�Ժ�벿�ֽڵ㷴ת���Ƚ�ǰ�������ֵ�Ԫ���Ƿ����
 * */
public class Five {
	public boolean isPalindrome(Node head) {
        if(head == null || head.next == null){
            return true;
        }
        //ʹ�ÿ���ָ���ҵ��м�ڵ㣬��ָ��ÿ������������ָ��ÿ����һ��
        Node fast = head.next;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondhead = null;
        //��¼��벿�ֵ�ͷ�ڵ�
        Node second = slow.next;
        slow.next = null;
        //��벿�ֵ�������з�ת
        while(second != null){
            //��ʱ��������¼��һ���ڵ�
            Node tmp = second.next;
            second.next = secondhead;
            secondhead = second;
            second = tmp;
        }
        //����ĺ�벿�����ã���ʼ�ȽϽڵ�
        while(secondhead != null && head.data == secondhead.data){
            head = head.next;
            secondhead = secondhead.next;
        }
       if(secondhead == null){
           return true;
       }else{
           return false;
       }
	}
	public static void main(String[] args) {
		Node node6= new Node(1,null);
		Node node5= new Node(2,node6);
		Node node4 = new Node(3,node5);
		Node node3 = new Node(3,node4);
		Node node2 = new Node(2,node3);
		Node node1= new Node(1,node2);
		Five five = new Five();
		System.out.println(five.isPalindrome(node1));
	}
}
