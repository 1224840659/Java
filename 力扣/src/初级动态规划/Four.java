package 初级动态规划;
/*
 * 问题：你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，
 * 		影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 		如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。给定一个代表每个房屋存放金额的非负整数数组，
 * 		计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * 例子：输入: [1,2,3,1]输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。 偷窃到的最高金额 = 1 + 3 = 4 。
 * 
 * 思路：动态规划，针对末尾元素a[n],假设已经求出p(n-1)和p(n-2)即在不同位置盗取的最大金额
 * 盗贼盗取的最大金额有以下两种情况
 * 		(1)盗取第n个房间即p(n-2)+a[n]
 * 		(2)没有盗取第n个房间即p(n-1)
 * 		状态转移方程：p(n)=Math.max(p(n-2)+a[n],p(n-1))
 * 		n代表总共有几个房间
 * 		当n=0的时候，p(0)=0
 * 		当n=1的时候，p(1)=a[0]
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
