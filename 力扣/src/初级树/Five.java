package ������;
import ������.Node;
/*
 * ���⣺��һ����������ת��Ϊƽ�����������
 * ƽ�⣺���������ĸ߶�������1
 * ������������������<��<��
 * ˼�룺���������������������һ����������
 * �㷨ʵ�֣����ֲ��ҵ�˼��
 * */
public class Five {
	public Node sort(int[]a,int low,int high){
		
		if(low==high)
			return new Node(a[low]);
			
        if(low > high && high + 1 == low || low == a.length){
            return null;
        }
		int mid = (low+high)/2;
		Node root = new Node(a[mid]);
		root.left=sort(a,low,mid-1);
		root.right=sort(a,mid+1,high);
		return root;		
	}
	//�������
	public void midSort(Node root){
		if(root!=null){
		midSort(root.left);
		System.out.print(root.data+" ");
		midSort(root.right);
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,3,5,6,7,8};
		Five fi= new Five();
		Node root = fi.sort(arr, 0, arr.length-1);
		fi.midSort(root);		
	}
}
