package 动态规划;
/**
 * 
 * 问题：
 * 		假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
		每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
	思路：
	f(1)=1
	f(2)=2
	假设知道f(n-1)+f(n-2)
		状态方程为：f(n)
		状态转移方程为：f(n)=f(n-1)+f(n-2)
 * 
 * 
 */
class Solution {
    public int climbStairs(int n) {
        //一个台阶一种
        if(n==1){
            return 1;
        }
        //两个台阶两种
        if(n==2){
            return 2;
        }
        
        //n阶台阶的方法为n-1和n-2方法的总和
        return (climbStairs(n-1)+climbStairs(n-2));
        
    }
    public static void main(String []agrs){
        Solution sl =new Solution();
        int n=sl.climbStairs(4);
        System.out.println(n);
    }
}