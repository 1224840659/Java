package 初级数组;

import java.util.Arrays;

/*
 * 题目：给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

	最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

	你可以假设除了整数 0 之外，这个整数不会以零开头
 * 
 * */
public class Seven {
	//方法：主要判断当数组的末尾大于9的时候，产生进位
	public int[] come(int []a){
		int n=a.length-1;
		a[n]+=1;
		if(a[n]>9){
			while(n>0 && a[n]>9){
				a[n]=0;
				a[--n]+=1;
			}
		}
		if(n==0 && a[n]>9){
			a = new int[a.length+1];//数组扩大一位，首位变成1
			a[0]=1;
		}
	return a;
	}
	
	

	public static void main(String[] args) {
		int [] arr = {9,9,9,9};
		int []aa={9,9,9,8};
		Seven se = new Seven();
		int a[]=se.come(aa);
		System.out.println(Arrays.toString(a));
	}

}
