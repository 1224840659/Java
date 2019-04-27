package 初级动态规划;
/*
 * 
 * 问题：一次交易，买卖股票利润的最大值。给你一个数组，第i个元素是一支给定股票第i天的价格
 * 
 * 思路1：两层for循环逐个计算得出最大值，时间复杂度为O(n^2)
 * 思路2：定义两个变量，一个记录当前的最小元素，另一个记录当前的最大利润,时间复杂度为O(n)
 * 
 * */
public class Two {
	public int profit(int []a){
		int min=Integer.MAX_VALUE;
		int maxProfit=0;
		for(int i=0;i<a.length-1;i++){
			if(min>a[i])
				min=a[i];
			if(a[i]-min>maxProfit)
				maxProfit=a[i]-min;	
		} 
		return maxProfit;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a={7,1,5,3,6,4};
		int[]a1={7,6,5,4,3,1};
		Two two =new Two();
		int b=two.profit(a1);
		System.out.println(b);
	}

}
