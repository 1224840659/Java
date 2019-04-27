package 初级数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * 题目：
	给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
	你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 给定 nums = [2, 7, 11, 15], target = 9
	因为 nums[0] + nums[1] = 2 + 7 = 9
	所以返回 [0, 1]
 * */
public class Nine {
	//方法1：逐个遍历相加，找到和相等的数组的下标
	
	//方法2：利用hashMap空间换取速度
	public List search(int[]a,int target){
		List li =new ArrayList();
		HashMap hm =new HashMap();
		for(int i=0;i<a.length;i++){
			if(hm.containsKey(target-a[i])){
				li.add(i);
				li.add(hm.get(target-a[i]));
			}
			hm.put(a[i], i);
		}
		return li;
	}
	public static void main(String[] args) {
		int []arr={0,1,0,3,12};
		Nine ni =new Nine();
		List li=ni.search(arr,4);
		System.out.println(li.toString());

	}

}
