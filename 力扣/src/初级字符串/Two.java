package �����ַ���;
/*
 * ���⣺����һ��32λ���з��ŵ�����������Ҫ����������е�ÿλ�ϵ����ֽ��з�ת��
 * 
 * ˼·��
 * */
public class Two {
	public int reverse(int x) {
	    long i = 0;//��������ݶ����long�ͳ�������Ȼ����վ���޷�ִ��
	    long t = x;
	    while(t!=0)
	    {
	        i = 10*i + (t%10);
	        t=t/10;
	    }
	    if(i < Integer.MIN_VALUE || i > Integer.MAX_VALUE)//������ڻ���С���ٽ�ֵ��ô����0
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
