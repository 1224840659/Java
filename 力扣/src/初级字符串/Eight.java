package �����ַ���;
/*
 * ���⣺����������һ���������У��������е�������˳����б������õ���һ������
 * */
public class Eight {
    public String countAndSay(int n) {
        String s = "1";
        int k;
        for (int i = 1; i < n; i++) {
            StringBuilder t = new StringBuilder();//�̲߳���ȫ
            for (int j = 0; j < s.length(); j = k) {
                k = j;
                //���м�����ͬ��.
                while(k < s.length() && s.charAt(k) == s.charAt(j)) {
                    k++;
                }
                t.append(k - j).append(s.charAt(j));
            }
            s = t.toString();
        }
        return s;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =4;
		Eight eight = new Eight();
		System.out.println(eight.countAndSay(a));
	}
}
