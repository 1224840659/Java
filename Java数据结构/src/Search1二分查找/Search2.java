package Search1二分查找;
/*
 * 采用二分法查找顺序存储结构
 * 前提：数组是从小到大的有序排列
 * 
 * */
public class Search2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取数组
				int [] array1 = {1,3,4,5,6,2,8,10};
				//获取查找的值
				int score = 10;
				//数组的二分法查找
				//实际的时间复杂度为log2(n）
				//空间复杂度为O(1)
				//可以单独定义一个方法
				int low =0;
				int high = array1.length-1;
				//int index = search(array1, score);
				int index = search2(array1,score,low,high);
				//输出查找的数组下标
				if(index==-1) {
					System.out.println("查找的数值不存在数组中");
				}else {
					System.out.println(index);
				}	
	}
	//采用非递归的方式查找数组
	public static int search(int[]arr,int sc) {
		//获得low和high的下标
		int low =0;
		int high= arr.length-1;
		//判断
		int index =-1;
		while(low<=high) {
			//获得mid
			int mid = (low+high)/2;
			if(arr[mid]==sc) {
				index =mid;
			}else if(arr[mid]<sc) {
				low =mid+1;
			}else {//arr[mid]>sc
				high = mid-1;
			}
		}
		return index;
	}
	//采用递归的方式进行顺序存储的二分法查找
	//递归的时间复杂度为log2(n)
	//空间复杂度为O(1*log2(n))
	public static int search2(int []arr,int sc,int low ,int high) {
		//获得递归结束的条件
		if(low >high) {
			return -1;
		}
		int mid =(low +high)/2;
		if(sc==arr[mid]) {
			return mid;
		}else if(sc<arr[mid]) {
			return search2(arr,sc,low,mid-1);
		}else {
			return search2(arr,sc,mid+1,high);
		}
	}
}
