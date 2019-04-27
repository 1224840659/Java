package 初级字符串;

import java.util.Deque;
import java.util.LinkedList;

/*问题：编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * 
 * 思路1：增加额外的空间，反转想到利用栈空间的先进后出原则实现字符串的反转
 * 思路2：字符串的位置的对调
 * 思路3：StringBuilders的reverse函数
 * 
 * **/
public class One {
	//思路1
	public void string1(String[] a){
		Deque de = new LinkedList();
		for(int i=0;i<a.length;i++){
			de.push(a[i]);
		}
		while(de.size()>0){
			System.out.print(de.pop()+" ");
		}
		
	}
	//思路2:两层for循环，逐个位置进行调换
	public void string2(String[]b){
		for(int i=0;i<b.length;i++){
			String st = b[b.length-1];
			for(int j=b.length-1;j>i;j--){
				b[j]=b[j-1];
			}
			b[i]=st;
		}
	}
	//思路2：方法二 
	public void string22(String[]b){
		String temp="";
		for(int i=0;i<b.length/2;i++){
			 temp= b[b.length-1-i];
			 b[b.length-1-i]=b[i];
			 b[i]=temp;
		}
	}
	
	//思路3：利用StringBuilders的reverse的api函数
	public String string3(String[]c){
		//StringBuilders sb = new StringBuilders(c);
		 StringBuilder sb= new StringBuilder();
			for(String st:c){
				sb.append(st);
			}
			sb.reverse();
			return sb.toString();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] aa= {"h","e","l","l","o"};
		One one  = new One();
		//one.string1(aa);
		//String o=one.string3(aa);
		//System.out.println(o);
		one.string22(aa);
		for(String st:aa){
			System.out.print(st+" ");
		}
	}

}
