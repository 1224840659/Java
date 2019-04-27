package 初级数组;
/*
 * 题目：数组向右移动k个位置变成逆序数组
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 *	输出: [5,6,7,1,2,3,4]
 * */
public class Three {
	//方法一：每次把数组移动一个位置，移动K轮
	public static void move(int[]a,int k){
		for(int i=0;i<k;i++){
			int tmep=a[a.length-1];
			for(int j=a.length-1;j>0;j--){
				a[j]=a[j-1];
			}
			a[0]=tmep;
		}
	}
	
	//方法二
	/*
	 * a[0]到a[n-k-1]逆序321
	 * a[n-k]到a[n-1]逆序54
	 * 此时数组变成32154
	 * a[0]到a[n-1]逆序45123
	 * */
	//逆序函数
	public void sort(int[]a,int m,int n){
		for(;m<n;m++,n--){
		int temp=a[n];
		a[n]=a[m];
		a[m]=temp;
		}
	}
	public void move1(int[]a,int k){
		int n=a.length;
		k=k%n;//防止k比n大
		sort(a,0,n-k-1);
		sort(a,n-k,n-1);
		sort(a,0,n-1);
	}
	
	//方法三增加一个数组空间 
	public void move2(int a[],int k){
		int []arr = new int[a.length];
		//倒序后k个元素
		int n=a.length;
		int m=n-k;
		int l=n-k;
		for(int i=0;i<k;i++){
			arr[i]=a[m++];
		}
		System.out.println(m);
		//前k-1个元素向后移动
		for(int j=0;j<l;j++){
			arr[k++]=a[j];
		}
		//显示排序后的元素
		for(int mm=0;mm<a.length;mm++){
			System.out.print(arr[mm]+" "); 
		}
	}
	
	
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int k =2;
		Three three =new Three();
		three.move2(arr, k);
//		for(int i=0;i<arr.length;i++){
//			System.out.print(arr[i]+" ");
//		}
//	
	}

}
