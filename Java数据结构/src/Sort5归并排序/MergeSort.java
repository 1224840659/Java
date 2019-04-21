package Sort5归并排序;

import java.util.Arrays;

public class MergeSort {

	public static void merge(int[] a, int low, int mid, int high) {
		// 归并所需的辅助数组
		int[] aux = new int[a.length];
		// 将a[low..mid]和a[mid+1..high]归并
		//将
		int i = low, j = mid + 1;
		for (int k = low; k <= high; k++) {
			aux[k] = a[k];
		}
		/**
		 * 该方法先将所有元素复制到aux[]中，然后在归并回a[]中。方法咋归并时(第二个for循环) 进行了4个条件判断： -
		 * 左半边用尽(取右半边的元素) - 右半边用尽(取左半边的元素)
		 * 右半边的当前元素小于左半边的当前元素(取右半边的元素) -
		 * 右半边的当前元素大于等于左半边的当前元素(取左半边的元素)
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
		// 将左半边排序
		sort(a, low, mid);
		// 将右半边排序
		sort(a, mid + 1, high);
		merge(a, low, mid, high);
	}
	
	public static void main(String[] args) {
		// 给出无序数组
		int[] arr = { 72, 6, 57, 88, 60, 42, 83, 73, 48, 85, 72 };
		// 输出无序数组
		System.out.println(Arrays.toString(arr));
		MergeSort ms = new MergeSort();
		ms.sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
