package Sort3选择排序;
//思想：每轮找到最小的元素的位置，即下标与前面的元素位置交换
public class SelectSort {
	public void selectSort(int[] a){
		int temp;
		int flag;//元素对应的交换位置
		for(int i=0;i<a.length;i++){
			temp=a[i];
			flag=i;
			for(int j=i+1;j<a.length;j++){
				if(temp>a[j]){
					temp=a[j];//找到最小的元素
					flag=j;
				}
			}
			//位置交换
			if(flag!=i){
				a[flag]=a[i];
				a[i]=temp;
			}
		}
	} 
	public static void main(String[] args) {
		int a[]={2,5,3,3,7,7,9};
		SelectSort ss =new SelectSort();
		ss.selectSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
			
		}
	}
}
