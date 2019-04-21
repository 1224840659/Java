package Sort5�鲢����;

import java.util.Arrays;

public class MergeSort {

	public static void merge(int[] a, int low, int mid, int high) {
		// �鲢����ĸ�������
		int[] aux = new int[a.length];
		// ��a[low..mid]��a[mid+1..high]�鲢
		//��
		int i = low, j = mid + 1;
		for (int k = low; k <= high; k++) {
			aux[k] = a[k];
		}
		/**
		 * �÷����Ƚ�����Ԫ�ظ��Ƶ�aux[]�У�Ȼ���ڹ鲢��a[]�С�����զ�鲢ʱ(�ڶ���forѭ��) ������4�������жϣ� -
		 * �����þ�(ȡ�Ұ�ߵ�Ԫ��) - �Ұ���þ�(ȡ���ߵ�Ԫ��)
		 * �Ұ�ߵĵ�ǰԪ��С�����ߵĵ�ǰԪ��(ȡ�Ұ�ߵ�Ԫ��) -
		 * �Ұ�ߵĵ�ǰԪ�ش��ڵ������ߵĵ�ǰԪ��(ȡ���ߵ�Ԫ��)
		 */
		for (int k = low; k <= high; k++) {
			if (i > mid) {
				a[k] = aux[j++];
			} else if (j > high) {
				a[k] = aux[i++];
			} else if (aux[j] < aux[i]) {
				a[k] = aux[j++];
			} else {
				a[k] = aux[i++];
			}
		}
	}

	public static void sort(int[] a, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		// ����������
		sort(a, low, mid);
		// ���Ұ������
		sort(a, mid + 1, high);
		merge(a, low, mid, high);
	}
	
	public static void main(String[] args) {
		// ������������
		int[] arr = { 72, 6, 57, 88, 60, 42, 83, 73, 48, 85, 72 };
		// �����������
		System.out.println(Arrays.toString(arr));
		MergeSort ms = new MergeSort();
		ms.sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
