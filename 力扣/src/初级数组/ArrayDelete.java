package 初级数组;
/*
 * 题目：不增加额外空间的情况删除有序数组的重复元素，返回新数组的长度
 * 思想：快慢指针
 * 		数据相同，快指针向前走，直到数据不相同
 * 		数据不相同，快指针下标数据为转为慢指针数据
 * 		当快指针走到数组末尾结束，慢指针加1为不重复数组长度
 * */


public class ArrayDelete {

	public int delete(int a[]){
		int i;
		int j = 0;
		for(i=0;i<a.length;i++){
			if(a[j]!=a[i]){
				a[j++]=a[i];
			}	
		}
		return j;
	}
	
	public static void main(String[] args) {
		int [] arr={1,2,3,3,5,5,6};
		ArrayDelete ad =new ArrayDelete();
		System.out.println(ad.delete(arr)); 
		
	}

}
