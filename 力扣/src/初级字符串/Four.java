package 初级字符串;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 问题：给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * 
 * 思路1:字符串转换为字符数组并排序，逐个比较
 * 思路2：新建一个字符数组26位，记录字符串中出现字符的次数加1，再与另一个字符串出现的次数减1
 * 
 * */
public class Four {
	//思路1
	public Boolean bijiao(String a,String b){
		if(a.length()!=b.length())
			return false;
		char[] char1 = a.toCharArray();
		char[] char2 = b.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		for(int i=0;i<char1.length;i++){
				if(char1[i]!=char2[i])
					return false;
			}
		
		return true;
	} 
	
	//思路2
	public Boolean bijiao1(String a,String b){
		int[] char1= new int[26];
		for(char aa:a.toCharArray()){
			char1[aa-'a']++;
		}
		for(char bb:b.toCharArray()){
			char1[bb-'a']--;
		}
		
		for(int i:char1){
			if(i!=0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="shanyong";
		String str2 ="yongshao";
		Four four = new Four();
//		System.out.println(	four.bijiao(str1, str2));
//		}	
		System.out.println(four.bijiao1(str1,str2));
}
}