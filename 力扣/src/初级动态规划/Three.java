package 初级动态规划;
/*
 * 问题：给定一个整数数组，找到一个具有最大和的连续子数组，返回其最大和
 * 
 * 思路1：两层for循环，逐个相加并比较找出最大值，时间复杂度为O(n^2)
 * 思路2：动态规划，针对末尾元素a[n-1],最大子数组和包含以下三种情况
 * 		(1)子数组和包含a[n-1]
 * 		(2)子数组和不包含a[n-1],等同于求a[0]到a[n-2]的最大子数组和
 * 		(3)子数组和只有a[n-1]这一个元素
 * 		综上分析：
 * 			假设已经求出前n-2个数组的元素的最大子数组和f(n-2)
 * 			最大的子数组和的装填转移方程为：f(n-1)=max(f(n-2)+a[n-1],a[n-1],f(n-2))
 * */
public class Three {
	//思路1
	int max=0;
	int sum=0;
	public int sum1(int[]a){
		for(int i=0;i<a.length;i++){
			sum=a[i];
			for(int j=i+1;j<a.length;j++){
				sum += a[j];
				if(sum>max)
					max=sum;
			}
		}
		return max;
	}
	//思路2
	//f(n-1)=max(f(n-2)+a[n-1],a[n-1],f(n-2))
	public int sum2(int[]a){
		int max2 = a[0];//存放包含最后一个元素的最大子数组和
		int all =a[0];//比较结果后最大的子数组的和
		if(a.length==1)
			return max2;
		for(int i=1;i<a.length;i++){
			max2 = Math.max(max2+a[i], a[i]);//max2的结果中肯定存在最后一个元素
			all = Math.max(all, max2);
			}
		return all;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {-2,1,-3,4,-1,2,1,-5,4};
		Three three = new Three();
		System.out.println(three.sum1(arr));
		System.out.println(three.sum2(arr));
		
	}

}
