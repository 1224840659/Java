package ��������;

import java.util.Arrays;

/*
 * ���⣺����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
 * ����: [0,1,0,3,12]
	���: [1,3,12,0,0]
	˵��:
	������ԭ�����ϲ��������ܿ�����������顣
	�������ٲ�������
 * */
public class Eight {
	
	//����:�ҵ�����ܸ������������һ����0Ԫ�ؽ��н���λ�ã�
	public void search(int[] a){
		int sum =0;
		for(int i=0;i<a.length;i++){
			if(a[i]==0){
				sum+=1;
			}
			else if(sum>0){
				a[i-sum]=a[i];
				a[i]=0;
			}
		}
	}
	
	public static void main(String[] args) {
		int []arr={0,1,0,3,12};
		Eight ei =new Eight();
		ei.search(arr);
		System.out.println(Arrays.toString(arr));
	}

}
