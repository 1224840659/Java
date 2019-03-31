package Search2��ϣ����;

public class Search {

	    /* ��ϣ��� */ 
	    private class Node { 
	        int key; // �����еļ� 
	        Node next; // ��һ�����
	    }
	    //�ж��Ƿ�Ϊ����
		public boolean isPrimes(int n) {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
		/* �ڹ�ϣ���в��ҹؼ���key */
		public boolean hashSearch(int[] data, int key) {
		int p = 1;
		// Ѱ��С�ڻ������ӽ���������
		for (int i = data.length; i > 1; i--) {
			if (isPrimes(i)) {
				p = i;
				break;
			}
		}
		// ������ϣ��
		Node[] hashtable = createHashTable(data, p);
		// ����key�Ƿ��ڹ�ϣ����
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

		/* �����࣬����������ϣ�� */
	public Node[] createHashTable(int[] data, int p) {
		Node[] hashtable = new Node[p];
		int k; // ��ϣ��������ĵ�Ԫ��ַ
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

