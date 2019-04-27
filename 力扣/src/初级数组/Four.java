package 初级数组;

import java.util.HashMap;
import java.util.HashSet;

/*
 * 题目：检查数组种是否存在重复的元素，是返回true，不是返回false
 * 
 * */
public class Four {
	//方法一，两层for循环逐个比较
	
	
	//空间换取时间
	//方法二：构造一个hashtMap,key为数组元素，value为数组的个数
	public boolean check(int []a){
		HashMap<Integer, Integer> values= new HashMap<Integer, Integer>(); 
		for(int i=0;i<a.length;i++){
			if(values.containsKey(a[i])){
				return true;
			}
			else{
					values.put(a[i], 1);
			}
		}
		return false;
	}

	//方法三：构造一个hashSet,set集合种存放的元素是无序而且唯一的
	public boolean check1(int []a){
		HashSet values= new HashSet(); 
		for(int i=0;i<a.length;i++){
			if(values.contains(a[i])){
				return true;
			}
			else{
				values.add(a[i]);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int []arr={1,3,6,7,3};
		Four fo=new Four();
		boolean b=fo.check1(arr);
		System.out.println(b);

	}

}
