package ������̬�滮;

/*
 * ���⣺������ж�ν��ף�������Ʊ��������ֵ������һ�����飬��i��Ԫ����һ֧������Ʊ��i��ļ۸�
 * 		����һ֧��Ʊ��Ҫ�۳�һ����������
 * 
 * ˼·����̬�滮˼�룬��i�������й�Ʊ�����
 * 		(1)�й�Ʊ =��������+֮ǰ����
 * 		(2)û�й�Ʊ =�����۳�+֮ǰ�۳�
 * 		
 * */
public class Five {
	public int maxProfit(int[]a,int fee){
		int length = a.length;
		if (length<2)
			return 0;
		int last_own = -a[0];//�����й�Ʊ
		int last_no_own = 0;//����û�й�Ʊ
		for (int i=1;i<length;i++){
			//��ǰ�й�Ʊ
			int own =Math.max(last_own, last_no_own - a[i]);
			//��ǰû�й�Ʊ
			last_no_own = Math.max(last_no_own, last_own + a[i] - fee);
			last_own = own;	
		}
		return last_no_own; 
	}
	public static void main(String[] args) {
		int []arr ={1, 3, 2, 8, 4, 9};
		Five five = new Five();
		int profit=five.maxProfit(arr, 2);
		System.out.println(profit);	
	}

}
