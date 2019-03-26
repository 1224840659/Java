package 对象创建和类加载机制;

import java.util.concurrent.SynchronousQueue;

public class Ini {
	public static int k =0;
	public static Ini i1 = new Ini("i1");
	public static Ini i2 = new Ini("i2");
	public static int i = print("i");
	public static int n =99;
	public int j = print("j");
	{
		print("构造快");
	}
	static{
		print ("静态块");
	}
	public Ini(String str){
		System.out.println("Ini" + (++k) + ":" +str +" i=" + i +" n=" + n);
		++i;
		++n;
	} 
	public static int print(String str){
		System.out.println("print"+ (++k) + ":" +str +" i=" + i +" n=" + n);
		++n;
		return ++i;
	}
	public static void main(String[] args) {
		Ini i =new Ini("init");

	}

}
