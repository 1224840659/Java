package Sort1冒泡排序;

import Sort3选择排序.SelectSort;

//每一轮比较将最大的元素向后移动，第一轮最大的元素在最后位置
public class MaxMin {
	public void maxMin(int a[]){
		for(int i=0;i<a.length;i++){
		//从小到大排列
			for(int j=i+1;j<a.length;j++){
				//拿着当前位置的数据与后面所有位置的数据做比较，若是小于，则交换位置的数据
				if(a[i]<a[j]){
					int b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[] = { 2, 5, 3, 3, 7, 7, 9 };
		MaxMin mm = new MaxMin();
		mm.maxMin(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
