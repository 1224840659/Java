package Sort6������;
//˼�룺�����鿴����һ����ȫ�����������κ�һ����Ҷ�ӽ���ֵ��С�ڣ����߲����ڣ������Һ��ӵ�ֵ
public class Sort {
	public static void sort(int[] a) {
	for (int i = a.length - 1; i > 0; i--) {
		//�ҳ��Ѷ�Ԫ�أ���ʱΪ���ֵ
        max_heapify(a, i);
        //�Ѷ�Ԫ��(��һ��Ԫ��)�����һ��Ԫ�ؽ���
        int temp = a[0];
        a[0] = a[i];
        a[i] = temp;
    }
}

/***
 *
 *  ������ѻ�
 *  i = ��һ����Ҷ�ӽڵ㡣
 *  �ӵ�һ����Ҷ�ӽڵ㿪ʼ���ɡ���������һ��Ҷ�ӽڵ㿪ʼ��
 *  Ҷ�ӽڵ���Կ����ѷ��϶�Ҫ��Ľڵ㣬���ڵ�������Լ����Լ�����ֵΪ���
 *
 * @param a
 * @param n
 */
public static void max_heapify(int[] a, int n) {
    int child;
    for (int i = (n - 1) / 2; i >= 0; i--) {
        //���ӽڵ�λ��
        child = 2 * i + 1;
        //���ӽڵ�����Ҵ������ӽڵ㣬child������ӽڵ�
        if (child != n && a[child] < a[child + 1]) {
            child++;
        }
        //�������ڵ��������ӽڵ��е����ֵ
        if (a[i] < a[child]) {
            int temp = a[i];
            a[i] = a[child];
            a[child] = temp;
        }
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 5, 3, 3, 7, 7, 9 ,10,11};
		Sort mm = new Sort();
		mm.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
}
}
