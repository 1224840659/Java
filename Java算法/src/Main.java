
public class Main {

	public static void main(String[] args) {

			int number=100; //����һ����100���ˣ�ͬʱҲ���������� 
			int index=0; //���������±� 
			int say=0; //����
	     boolean array[]=new boolean[number];//����һ��boolean���͵����飬��������װ��ȥ������Ԫ��Ĭ��Ϊture��
	        for(int i=0;i<array.length;i++){    //������λ���˱���Ϊ3ʱ����������Ԫ�ش�ture�ĳ�false���Ӷ�ʵ��������1
	            array[i]=true;
	        }

	        while(number>1){                    //��ֻʣһ���˵�ʱ������ѭ��
	            if(array[index]){               //��λ����ʱ����
	                say++;                      //����
	            }
	            if(say==3){                     //������Ϊ��ʱ�����¿�ʼ����������λ�����뿪������λ��ֵ��Ϊfalse,������һ
	                say=0;
	                array[index]=false;
	                number--;
	            }
	            index++;                        //�����±��һ�������ƶ�����������
	            if(index==100){                 //�������±����100��ʱ�����¿�ʼһȦ�������±��Ϊ0
	                index=0;
	            }
	        }

	        for(int i=0;i<array.length;i++){    //���ж��ѭ�����ҳ����������ֵ��ȻΪture��Ԫ��
	            if(array[i]){                   
	                System.out.println("ʣ�µ��ǴӸտ�ʼ����֮��ĵ�"+i+"����");
	            }
	        }               
	    }

	}

