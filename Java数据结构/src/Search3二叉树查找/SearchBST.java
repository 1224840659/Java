package Search3����������;
public class SearchBST {
	/**
	 * ������ ���ݽṹ
	 */
	private static class BinTree {
		int data;
		BinTree lchild;
		BinTree rchild;
	}

	//���ڵ�
	static BinTree newTree = new BinTree();

	/** ȫ�ֱ��� ��Ų��ҵ��Ĺؼ������ڵĸ��ڵ� */
	static BinTree parentNode = new BinTree();
	
	//�������������Ĳ���
	public static boolean search( BinTree newTree,int key) {
		if (null == newTree || 0 == newTree.data) {// ���ĸ��ڵ㲻���ڣ�����
			return false;
		} else if (key == newTree.data) {// ���ҳɹ�
			System.out.println(key);
			return true;
		} else if (key < newTree.data) {// �ؼ���С�ڸ��ڵ������������
			return search(newTree.lchild, key);
		} else// �ؼ��ִ��ڸ��ڵ������������
			return search(newTree.rchild, key);
	}

	/**
	 * ����������
	 * 
	 * @param bt
	 *            ����ѯ����������
	 * @param key
	 *            ���ҹؼ���
	 * @param parent
	 *            ָ��bt��˫�ף����ʼ����ֵΪnull
	 * @return ���ҹؼ���key�ɹ� ����true����������㸳ֵ��ȫ�ֱ���result������ʧ�ܣ�����false
	 */
	public static boolean searchBST(BinTree bt, int key, BinTree parent) {
		if (null == bt || 0 == bt.data) {// ���ĸ��ڵ㲻���ڣ�����
			parentNode = parent;
			return false;
		} else if (key == bt.data) {// ���ҳɹ�
			parentNode = bt;
			return true;
		} else if (key < bt.data) {// �ؼ���С�ڸ��ڵ������������
			return searchBST(bt.lchild, key, bt);
		} else// �ؼ��ִ��ڸ��ڵ������������
			return searchBST(bt.rchild, key, bt);
	}

	/** ���ɶ��������� 
	 *�ص㣺������С�ڸ���ֵ�����������ڸ���ֵ
	 * */
	public static boolean generateBST(int key) {
		//newTree�Ǹ����
		if (!searchBST(newTree, key, null)) {
			BinTree s = new BinTree();
			s.data = key;
			s.lchild = s.rchild = null;
			if (null == parentNode)// �����ڣ�������Ǹ��ڵ㣬��sָ��bt��Ϊ�µĸ��ڵ�
				newTree = s;
			else if (key < parentNode.data)
				parentNode.lchild = s;// ��keyС���Ӹ���㣬�����Ϊ����
			else
				parentNode.rchild = s;// ��key�����Ӹ���㣬�����Ϊ�Һ���

			//preOrderTraverse(newTree);
			return true;
		} else
			System.out.println("�ýڵ��Ѵ���!");
		return false;
	}

	/**���õݹ鷽�� ���������ӡ���������� */
	static void preOrderTraverse(BinTree t) {
		if(t != null){
			//����������
			preOrderTraverse(t.lchild);//null
			//�������ֵ
			System.out.print(t.data+"  ");//7
			//����������
			preOrderTraverse(t.rchild);//null
		}
	}

	public static void main(String[] args) {
		int[] a = { 62, 88, 58, 47, 35, 73, 51, 99, 37, 93 };
		for (int i = 0; i < a.length; i++) {
			generateBST(a[i]);
		}
		preOrderTraverse(newTree);
		System.out.println();
		System.out.println(search(newTree, 73));
	}
}

