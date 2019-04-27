package ��������;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * ��Ŀ��
	����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
	����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
 * ���� nums = [2, 7, 11, 15], target = 9
	��Ϊ nums[0] + nums[1] = 2 + 7 = 9
	���Է��� [0, 1]
 * */
public class Nine {
	//����1�����������ӣ��ҵ�����ȵ�������±�
	
	//����2������hashMap�ռ任ȡ�ٶ�
	public List search(int[]a,int target){
		List li =new ArrayList();
		HashMap hm =new HashMap();
		for(int i=0;i<a.length;i++){
			if(hm.containsKey(target-a[i])){
				li.add(i);
				li.add(hm.get(target-a[i]));
			}
			hm.put(a[i], i);
		}
		return li;
	}
	public static void main(String[] args) {
		int []arr={0,1,0,3,12};
		Nine ni =new Nine();
		List li=ni.search(arr,4);
		System.out.println(li.toString());

	}

}
