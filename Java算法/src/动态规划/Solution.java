package ��̬�滮;
/**
 * 
 * ���⣺
 * 		������������¥�ݡ���Ҫ n ������ܵ���¥����
		ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�
	˼·��
	f(1)=1
	f(2)=2
	����֪��f(n-1)+f(n-2)
		״̬����Ϊ��f(n)
		״̬ת�Ʒ���Ϊ��f(n)=f(n-1)+f(n-2)
 * 
 * 
 */
class Solution {
    public int climbStairs(int n) {
        //һ��̨��һ��
        if(n==1){
            return 1;
        }
        //����̨������
        if(n==2){
            return 2;
        }
        
        //n��̨�׵ķ���Ϊn-1��n-2�������ܺ�
        return (climbStairs(n-1)+climbStairs(n-2));
        
    }
    public static void main(String []agrs){
        Solution sl =new Solution();
        int n=sl.climbStairs(4);
        System.out.println(n);
    }
}