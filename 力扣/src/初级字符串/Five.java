package �����ַ���;
/*
 * ���⣺����һ���ַ�������֤���Ƿ�Ϊ���ģ�ֻ������ĸ�������ַ�w�����Ժ�����ĸ�Ĵ�Сд
 * 
 * ˼·��˫ָ��i��j,һ����ǰ���������һ���Ӻ���ǰ��������a��b��¼i��j��ָ�ַ���ASCIIֵ��
 * */
public class Five {
	 public boolean isPalindrome(String s) {
	        int i = 0;
	        int j =s.length()-1;
	        while(i<j){
	        	int a = (int)s.charAt(i);
	        	int b = (int)s.charAt(j);
	        	//�Ƿ�Ϊ��д��ĸ
	        	if(65<= (int)s.charAt(i) && (int)s.charAt(i)<=90){
	        		a += 32;
	        	}
	        	if(65<= (int)s.charAt(j) && (int)s.charAt(j)<=90){
	        		b += 32;
	        	}
	        	//�Ƿ�Ϊ���ֺ�Сд���ַ�
	        	if(((48<= a && a<=57) || (97<= a && a<=122)) && ((48<= b && b<=57) ||(97<= b && b<=122))){
	        		if(a != b){
	        			return false;
	        		}else{
	        			i++;
	        			j--;
	        		}	
	        	}
	        	//�ж�a�Ƿ񳬳���Χ������iָ���һ���Ƿ�Ϊ�ַ������֣������Ǽ�����ǰ��
	        	if(48> a || (57<a && a<97) || a>122){
	        		i++;
	        	}
	        	//�ж�b�Ƿ񳬳���Χ������jָ���һ,
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
