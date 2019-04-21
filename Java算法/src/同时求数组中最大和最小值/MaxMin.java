package 同时求数组中最大和最小值;
/*
 * 另外开辟空间，用于存储两个变量最大和最小值
 * 采用分治法对数组左右拆分，分别比较左右两部分的最大和最小值
 * 时间复杂度：比较次数1.5N
 * 另一种非递归思想：比较相邻两个元素，较大的和max比较，较小的和min比较
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
