package ��̬�滮;
/*
 * ��̬�滮��˼��:
 * 	��i������Ĺ�Ʊֻ������״̬���й�Ʊ��û�й�Ʊ
 * �й�Ʊ�����=��������+��ǰδ������ǰʣ�µ�
 * û�й�Ʊ�����=��������+����δ���н��׺���ǰʣ�µ�
 * */
public class Solution3 {
	public int maxProfit(int[]a,int fee){
		int length = a.length;
		if (length<2)
			return 0;
		int last_own = -a[0];
		int last_no_own = 0;
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
		Solution3 one= new Solution3();
		int profit=one.maxProfit(arr, 2);
		System.out.println(profit);		
	}
}
