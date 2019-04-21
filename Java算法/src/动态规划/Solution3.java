package 动态规划;
/*
 * 动态规划的思想:
 * 	第i天手里的股票只有两种状态，有股票和没有股票
 * 有股票的情况=当天买入+当前未买入以前剩下的
 * 没有股票的情况=当天卖完+当天未进行交易和以前剩下的
 * */
public class Solution3 {
	public int maxProfit(int[]a,int fee){
		int length = a.length;
		if (length<2)
			return 0;
		int last_own = -a[0];
		int last_no_own = 0;
		for (int i=1;i<length;i++){
			//当前有股票
			int own =Math.max(last_own, last_no_own - a[i]);
			//当前没有股票
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
