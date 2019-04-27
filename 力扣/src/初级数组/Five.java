package 初级数组;
/*
 * 题目：给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素，
 * 返回该元素
 * 
 * */
public class Five {
	//方法:利用异或关系，位相等为0，不相等为1，而且满足交换律
	public int check(int [] a){
		int b =0;
		for(int i=0;i<a.length;i++){
	
			b ^=a[i];
		}
		return b;
	}
	public static void main(String[] args) {
		int []arr={1,2,4,4,2};
		Five fi=new Five();
		System.out.println(fi.check(arr)); 
	}
}
