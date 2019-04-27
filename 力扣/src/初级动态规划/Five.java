package 初级动态规划;

/*
 * 问题：允许进行多次交易，买卖股票利润的最大值。给你一个数组，第i个元素是一支给定股票第i天的价格，
 * 		卖出一支股票需要扣除一定的手续费
 * 
 * 思路：动态规划思想，第i天手里有股票的情况
 * 		(1)有股票 =当天买入+之前买入
 * 		(2)没有股票 =当天售出+之前售出
 * 		
 * */
public class Five {
	public int maxProfit(int[]a,int fee){
		int length = a.length;
		if (length<2)
			return 0;
		int last_own = -a[0];//当天有股票
		int last_no_own = 0;//当天没有股票
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
		Five five = new Five();
		int profit=five.maxProfit(arr, 2);
		System.out.println(profit);	
	}

}
