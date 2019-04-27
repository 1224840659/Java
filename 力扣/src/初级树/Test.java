package ³õ¼¶Ê÷;

import ³õ¼¶Ê÷.Node;

public class Test {

	public static void main(String[] args) {
		Node node5 = new Node(4,null,null);
		Node node4 = new Node(4, null, null);
		Node node3 = new Node(5, null, node5);
		Node node2 = new Node(5, node4, null);	
		Node node1 = new Node(3,node2,node3);
		Four fo = new Four();
		fo.sort(node1);
	}

}
