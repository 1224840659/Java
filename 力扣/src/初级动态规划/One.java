package ������̬�滮;
/*
 * ���⣺������������¥�ݡ���Ҫ n ������ܵ���¥����ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�
 * 
 * ˼·����̬�滮��״̬ת�Ʒ��̵���n�׷������ڵ���n-1�׼���n-2�׵ķ�����
 * f(1)=1
 * f(2)=2
 * �����Ѿ����n-1��n-2�ķ���
 * f(n)=f(n-1)+f(n-2)
 * */
public class One {
	public int climbStairs(int n){
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		return climbStairs(n-1)+climbStairs(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One one = new One();
		int a=one.climbStairs(5);
		System.out.println(a);

	}

}
