package �����ַ���;

import java.util.Deque;
import java.util.LinkedList;

/*���⣺��дһ���������������ǽ�������ַ�����ת�����������ַ������ַ����� char[] ����ʽ������
 * ��Ҫ�����������������Ŀռ䣬�����ԭ���޸��������顢ʹ�� O(1) �Ķ���ռ�����һ���⡣
 * ����Լ��������е������ַ����� ASCII ����еĿɴ�ӡ�ַ���
 * 
 * ˼·1�����Ӷ���Ŀռ䣬��ת�뵽����ջ�ռ���Ƚ����ԭ��ʵ���ַ����ķ�ת
 * ˼·2���ַ�����λ�õĶԵ�
 * ˼·3��StringBuilders��reverse����
 * 
 * **/
public class One {
	//˼·1
	public void string1(String[] a){
		Deque de = new LinkedList();
		for(int i=0;i<a.length;i++){
			de.push(a[i]);
		}
		while(de.size()>0){
			System.out.print(de.pop()+" ");
		}
		
	}
	//˼·2:����forѭ�������λ�ý��е���
	public void string2(String[]b){
		for(int i=0;i<b.length;i++){
			String st = b[b.length-1];
			for(int j=b.length-1;j>i;j--){
				b[j]=b[j-1];
			}
			b[i]=st;
		}
	}
	//˼·2�������� 
	public void string22(String[]b){
		String temp="";
		for(int i=0;i<b.length/2;i++){
			 temp= b[b.length-1-i];
			 b[b.length-1-i]=b[i];
			 b[i]=temp;
		}
	}
	
	//˼·3������StringBuilders��reverse��api����
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
