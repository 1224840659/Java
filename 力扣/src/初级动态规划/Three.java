package ������̬�滮;
/*
 * ���⣺����һ���������飬�ҵ�һ���������͵����������飬����������
 * 
 * ˼·1������forѭ���������Ӳ��Ƚ��ҳ����ֵ��ʱ�临�Ӷ�ΪO(n^2)
 * ˼·2����̬�滮�����ĩβԪ��a[n-1],���������Ͱ��������������
 * 		(1)������Ͱ���a[n-1]
 * 		(2)������Ͳ�����a[n-1],��ͬ����a[0]��a[n-2]������������
 * 		(3)�������ֻ��a[n-1]��һ��Ԫ��
 * 		���Ϸ�����
 * 			�����Ѿ����ǰn-2�������Ԫ�ص�����������f(n-2)
 * 			����������͵�װ��ת�Ʒ���Ϊ��f(n-1)=max(f(n-2)+a[n-1],a[n-1],f(n-2))
 * */
public class Three {
	//˼·1
	int max=0;
	int sum=0;
	public int sum1(int[]a){
		for(int i=0;i<a.length;i++){
			sum=a[i];
			for(int j=i+1;j<a.length;j++){
				sum += a[j];
				if(sum>max)
					max=sum;
			}
		}
		return max;
	}
	//˼·2
	//f(n-1)=max(f(n-2)+a[n-1],a[n-1],f(n-2))
	public int sum2(int[]a){
		int max2 = a[0];//��Ű������һ��Ԫ�ص�����������
		int all =a[0];//�ȽϽ��������������ĺ�
		if(a.length==1)
			return max2;
		for(int i=1;i<a.length;i++){
			max2 = Math.max(max2+a[i], a[i]);//max2�Ľ���п϶��������һ��Ԫ��
			all = Math.max(all, max2);
			}
		return all;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {-2,1,-3,4,-1,2,1,-5,4};
		Three three = new Three();
		System.out.println(three.sum1(arr));
		System.out.println(three.sum2(arr));
		
	}

}
