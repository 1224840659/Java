package 初级数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/*
 * 给定两个数组，编写一个函数来计算它们的交集。
 * */
public class Six {
	//方法1：两层for循环，对两个数组的元素进行逐个比较，相等则是交集
	
	//方法2：创建一个hashMap，key为一个数组的元素，value为元素的个数，判断另一个元素是否在hashMap中
	public List check(int[]a,int[] b){
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		ArrayList<Integer> al =new ArrayList<Integer>();
		for(int i=0;i<a.length;i++){
			if(hm.containsKey(a[i])){
				hm.put(a[i], hm.get(a[i])+1);
			}
			else{
				hm.put(a[i], 1);
			}
		}
		for(int j=0;j<b.length;j++){
			if(hm.containsKey(b[j])){
				al.add(b[j]);
				hm.put(b[j], hm.get(b[j])+1);
			}
			else{
				hm.put(b[j], 1);
			}
		}
		return al;
	}
	
	//方法3:先对另一个数组进行排序，用另一个数组中的元素在另一个数组中进行二分搜索，找到重复元素
	
	public List sort(int[]a,int[]b){
		ArrayList<Integer> al =new ArrayList<Integer>();
		Arrays.sort(b);
		for(int i=0;i<a.length;i++){
			int mid=search(a[i],b,0,b.length-1);
			if(mid!=(-1)&& !al.contains(b[mid])){
				al.add(a[i]);
			}
		}
		return al;
	}
	
	public int search(int c,int[]b,int low,int high){
		//二分递归查找有序数组
		if(low>high){
			return -1;
		}
		int mid=(low+high)/2;
		if(c==b[mid]){
			return mid;
		}
		else if(c<b[mid]){
			return search(c,b,low,mid-1);	
		}
		else {
			return search(c,b,mid+1,high);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int []arr={1,3,6,7,3};
		int []arr1={2,4,5,7,3};
		Six si=new Six();
		List li= si.sort(arr, arr1);
		Iterator in=li.iterator();
		while(in.hasNext()){
			System.out.print( in.next()+" ");
		}
		System.out.println(Arrays.toString(arr1));
//		System.out.println(li.toString());
//		
//		System.out.println(li.toArray());//地址

	}

}
