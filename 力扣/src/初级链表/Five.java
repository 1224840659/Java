package 初级链表;
/*
 * 问题：判断一个链表是否为回文链表
 * 输入: 1->2->2->1输出: true
 * 输入: 1->2输出: false
 * 
 * 思路：快慢指针，找到中间节点，对后半部分节点反转，比较前后两部分的元素是否相等
 * */
public class Five {
	public boolean isPalindrome(Node head) {
        if(head == null || head.next == null){
            return true;
        }
        //使用快慢指针找到中间节点，快指针每次走两步，慢指针每次走一步
        Node fast = head.next;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondhead = null;
        //记录后半部分的头节点
        Node second = slow.next;
        slow.next = null;
        //后半部分的链表进行反转
        while(second != null){
            //临时变量，记录下一个节点
            Node tmp = second.next;
            second.next = secondhead;
            secondhead = second;
            second = tmp;
        }
        //链表的后半部分逆置，开始比较节点
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
