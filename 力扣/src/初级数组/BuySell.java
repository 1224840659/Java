package 初级数组;

/*
 * 	给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
	如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
	注意你不能在买入股票前卖出股票。
 * */
public class BuySell {
    public int maxProfit(int[] prices) {
        int i;
        int max=0;
    	for(i=prices.length-1;i>0;i--){
    		for(int j=i-1;j>0;j--){
    		int m=prices[i]-prices[j];
    		if(max<m){
    			max=m;
    			//System.out.println(max);
    		}
    	}
    	}
    	return max;
    }
    /**
     * 使我们感兴趣的点是上图中的峰和谷。我们需要找到最小的谷之后的最大的峰。 
     * 我们可以维持两个变量——minprice 和 maxprofit，
     * 它们分别对应迄今为止所得到的最小的谷值和最大的利润（卖出价格与最低价格之间的最大差值）。
     * */
    public int maxProfit1(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        System.out.println(minprice);
        return maxprofit;
    }
	public static void main(String[] args) {
		//int [] arr={7,2,8,3,6,1,6};
		int [] arr={7,5,3,2,1};
		BuySell sl= new BuySell();
		System.out.println(sl.maxProfit1(arr)); 
	}

}
