package ���Ա�;

import java.util.Arrays;

/**
 * ˳���  
 * �ײ���õ����飬���ǳ��ȿ��Զ�̬�仯
 * 
 * java.util.ArrayList ÿ������50%
 * @author Administrator
 *
 */
public class ArrayList implements List {

	private Object[] elementData; //�ײ���һ�����飬Ŀǰ��û��ȷ������
	private int size;  //������������˼����ռ䣬����Ԫ�صĸ���
	public ArrayList() {
		//û��ָ�����ȣ�Ĭ�ϳ�����4
		this(4);
	}
	/**
	 * 
	 * @param initialCapacity ָ������ĳ�ʼ����
	 */
	public ArrayList(int initialCapacity) {
		//���������ָ�������Ŀռ�
		elementData = new  Object[initialCapacity];
	}
	
	@Override
	public int size() {
		
		return size;
	}

	@Override
	public Object get(int i) {
		
		if(i<0 || i>=size){//i<0  ���� i>=size
			//throw new RuntimeException("��������Խ���쳣��"+i);
			throw new MyArrayIndexOutOfBoundsException("��������Խ���쳣��"+i);
		}
		
		return elementData[i];
	}

	@Override
	public boolean isEmpty() {
		return size ==0;
	}

	@Override
	public boolean contains(Object e) {
		for(int i=0;i<size;i++){
			//==�Ƚϵ��Ƕ������õĵ�ַ��equals�Ƚϵ��Ƕ����ֵ�Ƿ����
			if(elementData[i].equals(e)){
				return true;
			}
		}
		return false;
	}

	@Override
	public int indexOf(Object e) {
		for(int i=0;i<size;i++){
			if(elementData[i].equals(e)){
				return i;
			}
		}
		throw new MyArrayIndexOutOfBoundsException("������û�д�����");
		
	}

	@Override
	public void add(int i, Object e) {
		//i��λ��Ҫ��ȷ
		if(i<0 || i>size){
			throw new MyArrayIndexOutOfBoundsException("��������Խ���쳣:"+i);
		}
		//�������ˣ�������
		if(size == elementData.length){
			grow();
		}
		//����i�������Ԫ�أ������һ��Ԫ�ؿ�ʼ
		for(int j=size ;j>i; j--){
			elementData[j] = elementData[j-1];
		}
		
		//�������i��λ�ø�ֵ
		elementData[i] = e;
		//Ԫ�ظ���+1
		size++;
	}
	
	@Override
	public void add(Object e) {
		this.add(size, e);
	}
	
	private void grow(){
		elementData = Arrays.copyOf(elementData, elementData.length*2);
	}

	@Override
	public boolean addBefore(Object obj, Object e) {
		for(int i=0;i<size;i++){
			if(elementData[i].equals(obj)){
				//����i�������Ԫ�أ������һ��Ԫ�ؿ�ʼ
				for(int j=size ;j>i; j--){
					elementData[j] = elementData[j-1];
				}
				//�������i��λ�ø�ֵ
				elementData[i] = e;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addAfter(Object obj, Object e) {
		for(int i=0;i<size;i++){
			if(elementData[i].equals(obj)){
				//����i+1�������Ԫ�أ������һ��Ԫ�ؿ�ʼ
				for(int j=size ;j>i+1; j--){
					elementData[j] = elementData[j-1];
				}
				//�������i��λ�ø�ֵ
				elementData[i+1] = e;
				return true;
			}
		}
		return false;
	}
	@Override
	public Object remove(int i) {
		if(i<0||i>=size){
			throw new MyArrayIndexOutOfBoundsException("����Խ��");
		}
		Object obj =elementData[i];
		for(int j=i;j<size-1;j++){
			elementData[j]=elementData[j+1];
			}
		//��ʱ�������һ��λ��ʱ��ɾ������Ԫ�صĴ�С
		size--;
		System.out.println(size);
		return obj;
	}
	@Override
	public boolean removeO(Object e) {
		for(int i=0;i<size;i++){
			if(elementData[i].equals(e)){
				for(int j=i;j<size-1;j++){
					elementData[j]=elementData[j+1];
					}
				size--;
				return true;
			}
	}
		return false;
	}
	@Override
	public Object replace(int i, Object e) {
		elementData[i] = e;
		return elementData[i];
	}

	@Override
	public String toString() {
		if(size == 0){
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		for(int i=0;i<size;i++){
			if(i !=size -1){
				builder.append(elementData[i]+",");
			}else{
				builder.append(elementData[i]);
			}
		}
		builder.append("]");
		return builder.toString();
	}
}
