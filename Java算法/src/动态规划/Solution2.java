package ��̬�滮;
/*
 * ���⣺����n��2*1�ľ��Σ���Ҫ����2*n��������δ�С���ܹ��ж����ַ���
 * */
public class Solution2 {

	public int lean(int n){
		//״̬����
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		//״̬ת�Ʒ���
		return lean(n-1)+lean(n-2);
	}
	public static void main(String[] args) {
		
		Solution2 so =new Solution2();
		System.out.println(so.lean(3));
		

	}

}
