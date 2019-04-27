package 初级字符串;
/*
 * 问题：给出一个32位的有符号的整数，你需要将这个整数中的每位上的数字进行反转。
 * 
 * 思路：
 * */
public class Two {
	public int reverse(int x) {
	    long i = 0;//这里的数据定义成long型常量，不然在网站上无法执行
	    long t = x;
	    while(t!=0)
	    {
	        i = 10*i + (t%10);
	        t=t/10;
	    }
	    if(i < Integer.MIN_VALUE || i > Integer.MAX_VALUE)//如果大于或者小于临界值那么返回0
	    {
	        return 0;
	    }
	    return (int)i;
	}

	public static void main(String[] args) {
		int a=-1234;
		Two two = new Two();
		int b=two.reverse(a);
		System.out.println(b);
	}
}
