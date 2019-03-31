package Sort4��������;
//���÷ֶ���֮��˼�룬�ҵ���Ӧ�Ļ�׼ֵ������� �����ֳ�С������
import java.util.Arrays;
public class TestQuickSort {

	public static int partition(int[] arr, int low, int high) {
		int  i =low;
		int j = high;
		int x =arr[i];
		//ʹ��ѭ��ʵ�ַ�������
		while(i<j) {
			//���������ƶ�j���ҵ���һ����xС��ֵ
			while(i<j && arr[j]>=x) {
				j--;
			}
			//����ֵ��ӣ�����ָ��λ��i++
			if(i<j) {
				arr[i] =arr[j];
				i++;
			}
			//���������ƶ�i���ҵ���һ�����ڻ�׼ֵ��ֵ
			while(i<j && arr[i]<=x) {
				i++;
			}
			//����ֵ�ŵ��ұߵĿ��У���ָ��j--
			if(i<j) {
				arr[j]=arr[i];
			}
		}         
		//��i=jʱ��ʹ�û�׼ֵ��ӣ�����ǻ�׼ֵ������λ��
		arr[i] = x;
		//���ػ�׼ֵ��λ������
		return i;
	}
	//�ݹ�ʵ�ֿ�����
	private static void QuickSort(int[] arr, int low, int high) {
		//�ݹ�Ľ�������low < high
		if(low < high) {
			//������������һ������ֳ��������������ط������޵�����
			int index = partition(arr,low,high);
			//����������п���
			QuickSort(arr,low,index-1);
			//���ҷ������п���
			QuickSort(arr,index+1,high);
		}
	}
	public static void QuickSort(int[] arr) {
		int low= 0;
		int high = arr.length-1;
		QuickSort(arr,low,high);
	}
	public static void main(String[] args) {
		//������������
		int[] arr = {72,6,57,88,60,42,83,73,48,85,72};
		//�����������
		System.out.println(Arrays.toString(arr));
		//��������
		QuickSort(arr);
		//partition(arr, 0, 9);
		//�����������
		System.out.println(Arrays.toString(arr));
	}
}
