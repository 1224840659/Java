package Sort2插入排序;
//以第一个元素为有序，其后元素与其比较，选择插入在有序元素的后面还是前面
public class InsertSort {
	public void insertSort(int[] a){
		//找到第一个元素作为有序元素
		for(int i=1;i<a.length;i++){
			int temp =a[i];
			int j=i;
			//后一个元素小于前一个元素，进行位置交换
			if(a[j-1]>temp){
				while(j>=1&&a[j-1]>temp){
					int b=a[j-1];
					a[j-1]=a[j];
					a[j]=b;
					j--;
				}
			}
			// 后一个元素大于或者等于前一个元素
		//	a[j] = temp;//可以去掉不改变位置即可
		}
	}
	public static void main(String[] args) {
		int array[]={3,5,1,3,7,6,9};
		InsertSort is=new InsertSort();
		is.insertSort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		
	}

}
