package ��������;

import java.util.HashMap;
import java.util.HashSet;

/*
 * ��Ŀ������������Ƿ�����ظ���Ԫ�أ��Ƿ���true�����Ƿ���false
 * 
 * */
public class Four {
	//����һ������forѭ������Ƚ�
	
	
	//�ռ任ȡʱ��
	//������������һ��hashtMap,keyΪ����Ԫ�أ�valueΪ����ĸ���
	public boolean check(int []a){
		HashMap<Integer, Integer> values= new HashMap<Integer, Integer>(); 
		for(int i=0;i<a.length;i++){
			if(values.containsKey(a[i])){
				return true;
			}
			else{
					values.put(a[i], 1);
			}
		}
		return false;
	}

	//������������һ��hashSet,set�����ִ�ŵ�Ԫ�����������Ψһ��
	public boolean check1(int []a){
		HashSet values= new HashSet(); 
		for(int i=0;i<a.length;i++){
			if(values.contains(a[i])){
				return true;
			}
			else{
				values.add(a[i]);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int []arr={1,3,6,7,3};
		Four fo=new Four();
		boolean b=fo.check1(arr);
		System.out.println(b);

	}

}
