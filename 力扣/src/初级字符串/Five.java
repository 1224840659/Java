package 初级字符串;
/*
 * 问题：给定一个字符串，验证它是否为回文，只考虑字母和数字字符w，可以忽略字母的大小写
 * 
 * 思路：双指针i、j,一个从前往后遍历，一个从后往前遍历，用a、b记录i、j所指字符的ASCII值，
 * */
public class Five {
	 public boolean isPalindrome(String s) {
	        int i = 0;
	        int j =s.length()-1;
	        while(i<j){
	        	int a = (int)s.charAt(i);
	        	int b = (int)s.charAt(j);
	        	//是否为大写字母
	        	if(65<= (int)s.charAt(i) && (int)s.charAt(i)<=90){
	        		a += 32;
	        	}
	        	if(65<= (int)s.charAt(j) && (int)s.charAt(j)<=90){
	        		b += 32;
	        	}
	        	//是否为数字和小写的字符
	        	if(((48<= a && a<=57) || (97<= a && a<=122)) && ((48<= b && b<=57) ||(97<= b && b<=122))){
	        		if(a != b){
	        			return false;
	        		}else{
	        			i++;
	        			j--;
	        		}	
	        	}
	        	//判断a是否超出范围，是则i指针加一；是否为字符和数字，若不是继续向前加
	        	if(48> a || (57<a && a<97) || a>122){
	        		i++;
	        	}
	        	//判断b是否超出范围，是则j指针减一,
	        	if(48> b || (57<b && b<97) || b>122){
	        		j--;
	        	}	
	        }
	        return true;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		Five five = new Five();
		System.out.println(five.isPalindrome(s));

	}

}
