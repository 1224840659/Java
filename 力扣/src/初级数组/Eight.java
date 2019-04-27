package 初级数组;

import java.util.Arrays;

/*
 * 问题：给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 输入: [0,1,0,3,12]
	输出: [1,3,12,0,0]
	说明:
	必须在原数组上操作，不能拷贝额外的数组。
	尽量减少操作次数
 * */
public class Eight {
	
	//方法:找到零的总个数，将其与后一个非0元素进行交换位置，
	public void search(int[] a){
		int sum =0;
		for(int i=0;i<a.length;i++){
			if(a[i]==0){
				sum+=1;
			}
			else if(sum>0){
				a[i-sum]=a[i];
				a[i]=0;
			}
		}
	}
	
	public static void main(String[] args) {
		int []arr={0,1,0,3,12};
		Eight ei =new Eight();
		ei.search(arr);
		System.out.println(Arrays.toString(arr));
	}

}
