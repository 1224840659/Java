package ��������;

import java.util.Arrays;

/*
 * ��Ŀ������һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��

	���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�

	����Լ���������� 0 ֮�⣬��������������㿪ͷ
 * 
 * */
public class Seven {
	//��������Ҫ�жϵ������ĩβ����9��ʱ�򣬲�����λ
	public int[] come(int []a){
		int n=a.length-1;
		a[n]+=1;
		if(a[n]>9){
			while(n>0 && a[n]>9){
				a[n]=0;
				a[--n]+=1;
			}
		}
		if(n==0 && a[n]>9){
			a = new int[a.length+1];//��������һλ����λ���1
			a[0]=1;
		}
	return a;
	}
	
	

	public static void main(String[] args) {
		int [] arr = {9,9,9,9};
		int []aa={9,9,9,8};
		Seven se = new Seven();
		int a[]=se.come(aa);
		System.out.println(Arrays.toString(a));
	}

}
