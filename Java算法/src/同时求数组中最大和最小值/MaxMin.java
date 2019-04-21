package ͬʱ��������������Сֵ;
/*
 * ���⿪�ٿռ䣬���ڴ洢��������������Сֵ
 * ���÷��η����������Ҳ�֣��ֱ�Ƚ����������ֵ�������Сֵ
 * ʱ�临�Ӷȣ��Ƚϴ���1.5N
 * ��һ�ַǵݹ�˼�룺�Ƚ���������Ԫ�أ��ϴ�ĺ�max�Ƚϣ���С�ĺ�min�Ƚ�
 * */
public class MaxMin {

	public class Mm{
		private int mMin;
		private int mMax;
		public Mm(int min,int max){	
			mMin=min;
			mMax=max;
		}
		
		public int getMin(){
			
			return mMin;
		}
		
		public void setMin(int value){
			
			mMin=value;
		}
		
		public int getMax(){
			
			return mMax;
		}
		
		public void setMax(int value){
			
			mMax=value;
		}

	}

	
	public Mm search(int array[],int low,int high){

		if(high-1<=low){
			if(array[low]>array[high]){
				return new Mm(array[high],array[low]);
			}else{
				return new Mm(array[low],array[high]);
			}
		}else{
		int index=(low+high)/2;
		Mm left=search(array,low,index);
		Mm right=search(array,index,high);
		int min =0;
		int max =0;
		min=left.getMin()>right.getMin()?right.getMin():left.getMin();
		max=left.getMax()>right.getMax()?left.getMax():right.getMax();
		return new Mm(min,max);
		}
	}
	
	public static void main(String[] args) {
		int array[]={1,3,5,33,7,5,6,2};
		MaxMin mm=new MaxMin();
		Mm mmm=mm.search(array, 0, array.length-1);
		System.out.println(mmm.getMin());
		System.out.println(mmm.getMax());
	}
}
