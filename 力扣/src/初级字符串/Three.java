package �����ַ���;
/* 
 * ���⣺����һ���ַ������ҵ����ĵ�һ�����ظ����ַ���������������������������ڣ��򷵻�-1.
 * 		�ٶ��ַ���ֻ��Сд��ĸ��
 * ���ӣ�s = "loveleetcode",���� 2.
 * 
 * ˼·������ռ����鳤��Ϊ26���ֱ��¼ÿ���ַ����ֵĴ���
 * ����һ��int�������飬����Ϊ26��26����ĸ�����ڼ�¼ stirng���ַ����ֵĴ���
 * */
public class Three {
	public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();//����ַ�����
        int len = chars.length;
        //�������鳤��Ϊ26����ʾ26����ĸ   0-25  �ֱ��ʾa-z��λ��
        int[] arr = new int[26];
        int count = 1;
        //�����ַ����飬�κ�һ����ĸ����һ�Σ�����arr�����Ӧλ�ü�1
        for(int i = 0;i<len;i++) {
            arr[chars[i] - 'a'] += count;
        }
        for(int i = 0;i<len;i++) {
            if(arr[chars[i] - 'a'] == 1) return i;
        }
        return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "loveleetcode";
		Three three =new Three();
		int i=three.firstUniqChar(a);
		System.out.println(i);
	}

}
