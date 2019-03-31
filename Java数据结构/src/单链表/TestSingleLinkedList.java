package µ¥Á´±í;

public class TestSingleLinkedList {

	public static void main(String[] args) {
		
		List list = new SingleLinkedList();
		
		list.add(123);
		list.add(321);
		list.add(456);
		list.add(678);
		list.add(789);
		list.add(111);
		list.add(222);
		
		list.add(5, 666);
		
//		System.out.println(list.size());
//		System.out.println(list.isEmpty());
//		System.out.println(list.get(5));
//		System.out.println(list.toString());
//		System.out.println(list.contains(111));
//		System.out.println(list.indexOf(456));
//		System.out.println(list.toString());
//		System.out.println(list.remove(3));
//		System.out.println(list.toString());
//		System.out.println(list.removeB(456));
		System.out.println(list.toString());
		System.out.println(list.replace(2, 999));
		System.out.println(list.toString());
	}

}
