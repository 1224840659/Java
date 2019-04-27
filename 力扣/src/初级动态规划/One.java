package 初级动态规划;
/*
 * 问题：假设你正在爬楼梯。需要 n 阶你才能到达楼顶。每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 
 * 思路：动态规划，状态转移方程到达n阶方法等于到达n-1阶加上n-2阶的方法和
 * f(1)=1
 * f(2)=2
 * 假设已经求出n-1和n-2的方法
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
