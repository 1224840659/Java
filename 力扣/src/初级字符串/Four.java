package �����ַ���;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * ���⣺���������ַ��� s �� t ����дһ���������ж� t �Ƿ��� s ��һ����ĸ��λ�ʡ�
 * 
 * ˼·1:�ַ���ת��Ϊ�ַ����鲢��������Ƚ�
 * ˼·2���½�һ���ַ�����26λ����¼�ַ����г����ַ��Ĵ�����1��������һ���ַ������ֵĴ�����1
 * 
 * */
public class Four {
	//˼·1
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
	
	//˼·2
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