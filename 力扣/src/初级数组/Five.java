package ��������;
/*
 * ��Ŀ������һ���ǿ��������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ�أ�
 * ���ظ�Ԫ��
 * 
 * */
public class Five {
	//����:��������ϵ��λ���Ϊ0�������Ϊ1���������㽻����
	public int check(int [] a){
		int b =0;
		for(int i=0;i<a.length;i++){
	
			b ^=a[i];
		}
		return b;
	}
	public static void main(String[] args) {
		int []arr={1,2,4,4,2};
		Five fi=new Five();
		System.out.println(fi.check(arr)); 
	}
}
