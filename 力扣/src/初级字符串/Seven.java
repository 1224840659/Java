package �����ַ���;
/*
 * ���⣺ʵ�� strStr() ����������һ�� haystack �ַ�����һ�� needle �ַ�����
 * 		�� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ�� (��0��ʼ)��
 * 		��������ڣ��򷵻�  -1��
 * ����������: haystack = "hello", needle = "ll" ���: 2
 * 
 * ˼·1������forѭ������ String1.startwith(String2)
 * ˼·2��indexOf()//��������ַ������±�
 * */
public class Seven {
	//˼·1
	public int strStr(String a, String b){
		if(b.equals(""))
			return 0;
		if(a.equals("")&&!b.equals(""))
			return -1;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)==b.charAt(0)){
				//startwith()�жϺ���a��ĳָ��λ���ǲ�����b��ʼ���ַ���
				if(a.substring(i).startsWith(b))
					return i;	
			}
		}		
	return -1;		
	}
	
	//˼·2
    public static int strStr1(String haystack,String needle) {
        return haystack.indexOf(needle);
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String s1="ll";
		Seven seven = new Seven();
		System.out.println(seven.strStr(s, s1));
		System.out.println(seven.strStr1(s, s1));
		
	}

}
