package Sort4快速排序;
//采用分而治之的思想，找到对应的基准值，将大的 数组拆分成小的数组
import java.util.Arrays;
public class TestQuickSort {

	public static int partition(int[] arr, int low, int high) {
		int  i =low;
		int j = high;
		int x =arr[i];
		//使用循环实现分区操作
		while(i<j) {
			//从右向左移动j，找到第一个比x小的值
			while(i<j && arr[j]>=x) {
				j--;
			}
			//将此值填坑，并且指针位置i++
			if(i<j) {
				arr[i] =arr[j];
				i++;
			}
			//从左向右移动i，找到第一个大于基准值的值
			while(i<j && arr[i]<=x) {
				i++;
			}
			//将此值放到右边的坑中，右指针j--
			if(i<j) {
				arr[j]=arr[i];
			}
		}         
		//当i=j时，使用基准值填坑，这就是基准值的最终位置
		arr[i] = x;
		//返回基准值的位置索引
		return i;
	}
	//递归实现快排序
	private static void QuickSort(int[] arr, int low, int high) {
		//递归的结束条件low < high
		if(low < high) {
			//分区操作，将一个数组分成两个分区，返回分区界限的索引
			int index = partition(arr,low,high);
			//对左分区进行快排
			QuickSort(arr,low,index-1);
			//对右分区进行快排
			QuickSort(arr,index+1,high);
		}
	}
	public static void QuickSort(int[] arr) {
		int low= 0;
		int high = arr.length-1;
		QuickSort(arr,low,high);
	}
	public static void main(String[] args) {
		//给出无序数组
		int[] arr = {72,6,57,88,60,42,83,73,48,85,72};
		//输出无序数组
		System.out.println(Arrays.toString(arr));
		//快速排序
		QuickSort(arr);
		//partition(arr, 0, 9);
		//输出有序数组
		System.out.println(Arrays.toString(arr));
	}
}
