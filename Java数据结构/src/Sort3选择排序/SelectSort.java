package Sort3ѡ������;
//˼�룺ÿ���ҵ���С��Ԫ�ص�λ�ã����±���ǰ���Ԫ��λ�ý���
public class SelectSort {
	public void selectSort(int[] a){
		int temp;
		int flag;//Ԫ�ض�Ӧ�Ľ���λ��
		for(int i=0;i<a.length;i++){
			temp=a[i];
			flag=i;
			for(int j=i+1;j<a.length;j++){
				if(temp>a[j]){
					temp=a[j];//�ҵ���С��Ԫ��
					flag=j;
				}
			}
			//λ�ý���
			if(flag!=i){
				a[flag]=a[i];
				a[i]=temp;
			}
		}
	} 
	public static void main(String[] args) {
		int a[]={2,5,3,3,7,7,9};
		SelectSort ss =new SelectSort();
		ss.selectSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
			
		}
	}
}
