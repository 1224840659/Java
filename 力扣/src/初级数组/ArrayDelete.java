package ��������;
/*
 * ��Ŀ�������Ӷ���ռ�����ɾ������������ظ�Ԫ�أ�����������ĳ���
 * ˼�룺����ָ��
 * 		������ͬ����ָ����ǰ�ߣ�ֱ�����ݲ���ͬ
 * 		���ݲ���ͬ����ָ���±�����ΪתΪ��ָ������
 * 		����ָ���ߵ�����ĩβ��������ָ���1Ϊ���ظ����鳤��
 * */


public class ArrayDelete {

	public int delete(int a[]){
		int i;
		int j = 0;
		for(i=0;i<a.length;i++){
			if(a[j]!=a[i]){
				a[j++]=a[i];
			}	
		}
		return j;
	}
	
	public static void main(String[] args) {
		int [] arr={1,2,3,3,5,5,6};
		ArrayDelete ad =new ArrayDelete();
		System.out.println(ad.delete(arr)); 
		
	}

}
