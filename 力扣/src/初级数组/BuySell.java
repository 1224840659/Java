package ��������;

/*
 * 	����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
	��������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ���������
	ע���㲻���������Ʊǰ������Ʊ��
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
     * ʹ���Ǹ���Ȥ�ĵ�����ͼ�еķ�͹ȡ�������Ҫ�ҵ���С�Ĺ�֮������ķ塣 
     * ���ǿ���ά��������������minprice �� maxprofit��
     * ���Ƿֱ��Ӧ����Ϊֹ���õ�����С�Ĺ�ֵ���������������۸�����ͼ۸�֮�������ֵ����
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
