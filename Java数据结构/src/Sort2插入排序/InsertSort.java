package Sort2��������;
//�Ե�һ��Ԫ��Ϊ�������Ԫ������Ƚϣ�ѡ�����������Ԫ�صĺ��滹��ǰ��
public class InsertSort {
	public void insertSort(int[] a){
		//�ҵ���һ��Ԫ����Ϊ����Ԫ��
		for(int i=1;i<a.length;i++){
			int temp =a[i];
			int j=i;
			//��һ��Ԫ��С��ǰһ��Ԫ�أ�����λ�ý���
			if(a[j-1]>temp){
				while(j>=1&&a[j-1]>temp){
					int b=a[j-1];
					a[j-1]=a[j];
					a[j]=b;
					j--;
				}
			}
			// ��һ��Ԫ�ش��ڻ��ߵ���ǰһ��Ԫ��
		//	a[j] = temp;//����ȥ�����ı�λ�ü���
		}
	}
	public static void main(String[] args) {
		int array[]={3,5,1,3,7,6,9};
		InsertSort is=new InsertSort();
		is.insertSort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		
	}

}
