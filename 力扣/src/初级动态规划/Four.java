package ������̬�滮;
/*
 * ���⣺����һ��רҵ��С͵���ƻ�͵���ؽֵķ��ݡ�ÿ�䷿�ڶ�����һ�����ֽ�
 * 		Ӱ����͵�Ե�Ψһ��Լ���ؾ������ڵķ���װ���໥��ͨ�ķ���ϵͳ��
 * 		����������ڵķ�����ͬһ���ϱ�С͵���룬ϵͳ���Զ�����������һ������ÿ�����ݴ�Ž��ķǸ��������飬
 * 		�������ڲ���������װ�õ�����£��ܹ�͵�Ե�����߽�
 * ���ӣ�����: [1,2,3,1]���: 4
 * ����: ͵�� 1 �ŷ��� (��� = 1) ��Ȼ��͵�� 3 �ŷ��� (��� = 3)�� ͵�Ե�����߽�� = 1 + 3 = 4 ��
 * 
 * ˼·����̬�滮�����ĩβԪ��a[n],�����Ѿ����p(n-1)��p(n-2)���ڲ�ͬλ�õ�ȡ�������
 * ������ȡ��������������������
 * 		(1)��ȡ��n�����伴p(n-2)+a[n]
 * 		(2)û�е�ȡ��n�����伴p(n-1)
 * 		״̬ת�Ʒ��̣�p(n)=Math.max(p(n-2)+a[n],p(n-1))
 * 		n�����ܹ��м�������
 * 		��n=0��ʱ��p(0)=0
 * 		��n=1��ʱ��p(1)=a[0]
 * */
public class Four {
	public int profit(int[] a,int i){
		int p=0;
		if(a.length==0)
			return 0;
		if(i==0)
			return a[i];
		else if(i==1)
			return  Math.max(a[i-1], a[i]);
		else{
			int A =profit(a,i-2)+a[i];
			int B = profit(a,i-1);
			return Math.max(A, B);
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={1,2,3,1};
		Four four = new Four();
		System.out.println(four.profit(arr, arr.length-1));
	}

}
