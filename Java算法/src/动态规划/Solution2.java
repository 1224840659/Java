package 动态规划;
/*
 * 问题：利用n个2*1的矩形，想要铺满2*n的面积矩形大小，总共有多少种方法
 * */
public class Solution2 {

	public int lean(int n){
		//状态方程
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		//状态转移方程
		return lean(n-1)+lean(n-2);
	}
	public static void main(String[] args) {
		
		Solution2 so =new Solution2();
		System.out.println(so.lean(3));
		

	}

}
