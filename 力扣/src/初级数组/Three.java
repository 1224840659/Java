package ��������;
/*
 * ��Ŀ�����������ƶ�k��λ�ñ����������
 * ����: [1,2,3,4,5,6,7] �� k = 3
 *	���: [5,6,7,1,2,3,4]
 * */
public class Three {
	//����һ��ÿ�ΰ������ƶ�һ��λ�ã��ƶ�K��
	public static void move(int[]a,int k){
		for(int i=0;i<k;i++){
			int tmep=a[a.length-1];
			for(int j=a.length-1;j>0;j--){
				a[j]=a[j-1];
			}
			a[0]=tmep;
		}
	}
	
	//������
	/*
	 * a[0]��a[n-k-1]����321
	 * a[n-k]��a[n-1]����54
	 * ��ʱ������32154
	 * a[0]��a[n-1]����45123
	 * */
	//������
	public void sort(int[]a,int m,int n){
		for(;m<n;m++,n--){
		int temp=a[n];
		a[n]=a[m];
		a[m]=temp;
		}
	}
	public void move1(int[]a,int k){
		int n=a.length;
		k=k%n;//��ֹk��n��
		sort(a,0,n-k-1);
		sort(a,n-k,n-1);
		sort(a,0,n-1);
	}
	
	//����������һ������ռ� 
	public void move2(int a[],int k){
		int []arr = new int[a.length];
		//�����k��Ԫ��
		int n=a.length;
		int m=n-k;
		int l=n-k;
		for(int i=0;i<k;i++){
			arr[i]=a[m++];
		}
		System.out.println(m);
		//ǰk-1��Ԫ������ƶ�
		for(int j=0;j<l;j++){
			arr[k++]=a[j];
		}
		//��ʾ������Ԫ��
		for(int mm=0;mm<a.length;mm++){
			System.out.print(arr[mm]+" "); 
		}
	}
	
	
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int k =2;
		Three three =new Three();
		three.move2(arr, k);
//		for(int i=0;i<arr.length;i++){
//			System.out.print(arr[i]+" ");
//		}
//	
	}

}
