
public class Main {

	public static void main(String[] args) {

			int number=100; //假设一共有100个人，同时也是数组容量 
			int index=0; //定义数组下标 
			int say=0; //报数
	     boolean array[]=new boolean[number];//定义一个boolean类型的数组，将所有人装进去，数组元素默认为ture。
	        for(int i=0;i<array.length;i++){    //当该座位的人报数为3时，将该数组元素从ture改成false。从而实现人数减1
	            array[i]=true;
	        }

	        while(number>1){                    //当只剩一个人的时候，跳出循环
	            if(array[index]){               //座位有人时报数
	                say++;                      //报数
	            }
	            if(say==3){                     //当报数为三时，重新开始计数，该座位的人离开，数组位置值变为false,人数减一
	                say=0;
	                array[index]=false;
	                number--;
	            }
	            index++;                        //数组下标加一，往后移动，继续报数
	            if(index==100){                 //当数组下标等于100的时候，重新开始一圈，数组下标变为0
	                index=0;
	            }
	        }

	        for(int i=0;i<array.length;i++){    //进行多次循环后，找出最后数组中值仍然为ture的元素
	            if(array[i]){                   
	                System.out.println("剩下的是从刚开始报数之后的第"+i+"个人");
	            }
	        }               
	    }

	}

