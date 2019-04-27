package 初级字符串;
/*
 * 问题：报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。
 * */
public class Eight {
    public String countAndSay(int n) {
        String s = "1";
        int k;
        for (int i = 1; i < n; i++) {
            StringBuilder t = new StringBuilder();//线程不安全
            for (int j = 0; j < s.length(); j = k) {
                k = j;
                //找有几个相同的.
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
