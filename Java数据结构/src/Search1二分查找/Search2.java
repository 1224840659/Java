package Search1���ֲ���;
/*
 * ���ö��ַ�����˳��洢�ṹ
 * ǰ�᣺�����Ǵ�С�������������
 * 
 * */
public class Search2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ȡ����
				int [] array1 = {1,3,4,5,6,2,8,10};
				//��ȡ���ҵ�ֵ
				int score = 10;
				//����Ķ��ַ�����
				//ʵ�ʵ�ʱ�临�Ӷ�Ϊlog2(n��
				//�ռ临�Ӷ�ΪO(1)
				//���Ե�������һ������
				int low =0;
				int high = array1.length-1;
				//int index = search(array1, score);
				int index = search2(array1,score,low,high);
				//������ҵ������±�
				if(index==-1) {
					System.out.println("���ҵ���ֵ������������");
				}else {
					System.out.println(index);
				}	
	}
	//���÷ǵݹ�ķ�ʽ��������
	public static int search(int[]arr,int sc) {
		//���low��high���±�
		int low =0;
		int high= arr.length-1;
		//�ж�
		int index =-1;
		while(low<=high) {
			//���mid
			int mid = (low+high)/2;
			if(arr[mid]==sc) {
				index =mid;
			}else if(arr[mid]<sc) {
				low =mid+1;
			}else {//arr[mid]>sc
				high = mid-1;
			}
		}
		return index;
	}
	//���õݹ�ķ�ʽ����˳��洢�Ķ��ַ�����
	//�ݹ��ʱ�临�Ӷ�Ϊlog2(n)
	//�ռ临�Ӷ�ΪO(1*log2(n))
	public static int search2(int []arr,int sc,int low ,int high) {
		//��õݹ����������
		if(low >high) {
			return -1;
		}
		int mid =(low +high)/2;
		if(sc==arr[mid]) {
			return mid;
		}else if(sc<arr[mid]) {
			return search2(arr,sc,low,mid-1);
		}else {
			return search2(arr,sc,mid+1,high);
		}
	}
}
