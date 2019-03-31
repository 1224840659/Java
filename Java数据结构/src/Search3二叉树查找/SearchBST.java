package Search3二叉树查找;
public class SearchBST {
	/**
	 * 二叉树 数据结构
	 */
	private static class BinTree {
		int data;
		BinTree lchild;
		BinTree rchild;
	}

	//根节点
	static BinTree newTree = new BinTree();

	/** 全局变量 存放查找到的关键字所在的父节点 */
	static BinTree parentNode = new BinTree();
	
	//二叉树排序树的查找
	public static boolean search( BinTree newTree,int key) {
		if (null == newTree || 0 == newTree.data) {// 树的根节点不存在，返回
			return false;
		} else if (key == newTree.data) {// 查找成功
			System.out.println(key);
			return true;
		} else if (key < newTree.data) {// 关键字小于根节点则查找左子树
			return search(newTree.lchild, key);
		} else// 关键字大于根节点则查找右子树
			return search(newTree.rchild, key);
	}

	/**
	 * 二叉排序树
	 * 
	 * @param bt
	 *            待查询二叉排序树
	 * @param key
	 *            查找关键字
	 * @param parent
	 *            指向bt的双亲，其初始调用值为null
	 * @return 查找关键字key成功 返回true，并把树结点赋值给全局变量result，查找失败，返回false
	 */
	public static boolean searchBST(BinTree bt, int key, BinTree parent) {
		if (null == bt || 0 == bt.data) {// 树的根节点不存在，返回
			parentNode = parent;
			return false;
		} else if (key == bt.data) {// 查找成功
			parentNode = bt;
			return true;
		} else if (key < bt.data) {// 关键字小于根节点则查找左子树
			return searchBST(bt.lchild, key, bt);
		} else// 关键字大于根节点则查找右子树
			return searchBST(bt.rchild, key, bt);
	}

	/** 生成二叉排序树 
	 *特点：左子树小于根的值，右子树大于根的值
	 * */
	public static boolean generateBST(int key) {
		//newTree是根结点
		if (!searchBST(newTree, key, null)) {
			BinTree s = new BinTree();
			s.data = key;
			s.lchild = s.rchild = null;
			if (null == parentNode)// 不存在，则表明是父节点，将s指向bt成为新的根节点
				newTree = s;
			else if (key < parentNode.data)
				parentNode.lchild = s;// 当key小于子根结点，则插入为左孩子
			else
				parentNode.rchild = s;// 当key大于子根结点，则插入为右孩子

			//preOrderTraverse(newTree);
			return true;
		} else
			System.out.println("该节点已存在!");
		return false;
	}

	/**采用递归方法 中序遍历打印线索二叉树 */
	static void preOrderTraverse(BinTree t) {
		if(t != null){
			//遍历左子树
			preOrderTraverse(t.lchild);//null
			//输出根的值
			System.out.print(t.data+"  ");//7
			//遍历右子树
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

