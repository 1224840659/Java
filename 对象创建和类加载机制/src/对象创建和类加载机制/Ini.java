package ���󴴽�������ػ���;

import java.util.concurrent.SynchronousQueue;

public class Ini {
	public static int k =0;
	public static Ini i1 = new Ini("i1");
	public static Ini i2 = new Ini("i2");
	public static int i = print("i");
	public static int n =99;
	public int j = print("j");
	{
		print("�����");
	}
	static{
		print ("��̬��");
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
