package Sort1ð������;

import Sort3ѡ������.SelectSort;

//ÿһ�ֱȽϽ�����Ԫ������ƶ�����һ������Ԫ�������λ��
public class MaxMin {
	public void maxMin(int a[]){
		for(int i=0;i<a.length;i++){
		//��С��������
			for(int j=i+1;j<a.length;j++){
				//���ŵ�ǰλ�õ��������������λ�õ��������Ƚϣ�����С�ڣ��򽻻�λ�õ�����
				if(a[i]<a[j]){
					int b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[] = { 2, 5, 3, 3, 7, 7, 9 };
		MaxMin mm = new MaxMin();
		mm.maxMin(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
