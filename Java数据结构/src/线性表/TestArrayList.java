package ÏßÐÔ±í;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class TestArrayList {

	public static void main(String[] args) {
		
//		Deque de;
//		Queue queue;
//		java.util.ArrayList  al;
//		Vector v;
//		LinkedList llist = new LinkedList();
//		
//		llist.add(123);
		List list = new ArrayList();
		list.add(123);
		list.add(321);
		list.add(456);
		list.add(678);
		list.add(789);
//		list.add(111);
//		list.add(222);
		list.add(3, 666);
//		System.out.println(list.size());
//		System.out.println(list.isEmpty());
//		System.out.println(list.get(3));
//		System.out.println(list.toString());
//		System.out.println(list.contains(666));
//		System.out.println(list.indexOf(666));
//		System.out.println(list.addBefore(666, 555));
//		System.out.println(list.toString());
//		System.out.println(list.addAfter(666,777));
//		System.out.println(list.toString());
//		System.out.println(list.remove(5));
//		System.out.println(list.toString());
//		System.out.println(list.removeO(666));
		System.out.println(list.toString());
		System.out.println(list.replace(3, 66666));
		System.out.println(list.toString());
	}

}
