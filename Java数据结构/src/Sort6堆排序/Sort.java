package Sort6堆排序;
//思想：将数组看成是一个完全二叉树，即任何一个非叶子结点的值不小于（或者不大于）其左右孩子的值
public class Sort {
	public static void sort(int[] a) {
	for (int i = a.length - 1; i > 0; i--) {
		//找出堆顶元素，此时为最大值
        max_heapify(a, i);
        //堆顶元素(第一个元素)与最后一个元素交换
        int temp = a[0];
        a[0] = a[i];
        a[i] = temp;
    }
}

/***
 *
 *  将数组堆化
 *  i = 第一个非叶子节点。
 *  从第一个非叶子节点开始即可。无需从最后一个叶子节点开始。
 *  叶子节点可以看作已符合堆要求的节点，根节点就是它自己且自己以下值为最大。
 *
 * @param a
 * @param n
 */
public static void max_heapify(int[] a, int n) {
    int child;
    for (int i = (n - 1) / 2; i >= 0; i--) {
        //左子节点位置
        child = 2 * i + 1;
        //右子节点存在且大于左子节点，child变成右子节点
        if (child != n && a[child] < a[child + 1]) {
            child++;
        }
        //交换父节点与左右子节点中的最大值
        if (a[i] < a[child]) {
            int temp = a[i];
            a[i] = a[child];
            a[child] = temp;
        }
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 5, 3, 3, 7, 7, 9 };
		Sort mm = new Sort();
		mm.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
}
}
