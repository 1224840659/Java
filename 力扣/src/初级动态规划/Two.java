package ������̬�滮;
/*
 * 
 * ���⣺һ�ν��ף�������Ʊ��������ֵ������һ�����飬��i��Ԫ����һ֧������Ʊ��i��ļ۸�
 * 
 * ˼·1������forѭ���������ó����ֵ��ʱ�临�Ӷ�ΪO(n^2)
 * ˼·2����������������һ����¼��ǰ����СԪ�أ���һ����¼��ǰ���������,ʱ�临�Ӷ�ΪO(n)
 * 
 * */
public class Two {
	public int profit(int []a){
		int min=Integer.MAX_VALUE;
		int maxProfit=0;
		for(int i=0;i<a.length-1;i++){
			if(min>a[i])
				min=a[i];
			if(a[i]-min>maxProfit)
				maxProfit=a[i]-min;	
		} 
		return maxProfit;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a={7,1,5,3,6,4};
		int[]a1={7,6,5,4,3,1};
		Two two =new Two();
		int b=two.profit(a1);
		System.out.println(b);
	}

}
