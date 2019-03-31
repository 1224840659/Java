package Search2哈希查找;

public class Search {

	    /* 哈希结点 */ 
	    private class Node { 
	        int key; // 链表中的键 
	        Node next; // 下一个结点
	    }
	    //判断是否为素数
		public boolean isPrimes(int n) {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
		/* 在哈希表中查找关键字key */
		public boolean hashSearch(int[] data, int key) {
		int p = 1;
		// 寻找小于或等于最接近表长的素数
		for (int i = data.length; i > 1; i--) {
			if (isPrimes(i)) {
				p = i;
				break;
			}
		}
		// 构建哈希表
		Node[] hashtable = createHashTable(data, p);
		// 查找key是否在哈希表中
		int k = key % p;
		Node cur = hashtable[k];
		while (cur != null && cur.key != key) {
			cur = cur.next;
		}
		if (cur == null) {
			return false;
		} else {
			return true;
		}

	}

		/* 用求余，链表法构建哈希表 */
	public Node[] createHashTable(int[] data, int p) {
		Node[] hashtable = new Node[p];
		int k; // 哈希函数计算的单元地址
		for (int i = 0; i < data.length; i++) {
			Node node = new Node();
			node.key = data[i];
			k = data[i] % p;
			if (hashtable[k] == null) {
				hashtable[k] = node;
			} else {
				Node current = hashtable[k];
				while (current.next != null) {
					current = current.next;
				}
				current.next = node;
			}
		}
		return hashtable;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 3, 4, 5, 6, 2, 8, 10 };
		Search ss = new Search();
		System.out.println(ss.hashSearch(array1, 7));
	}
}

