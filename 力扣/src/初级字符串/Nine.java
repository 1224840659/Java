package �����ַ���;
/*���⣺��дһ�������������ַ��������е������ǰ׺��
 * ��������ڹ���ǰ׺�����ؿ��ַ��� ""��
 * ����������: ["flower","flow","flight"]���: "fl"
 * 
 * ˼·��
 * */
public class Nine {
	public String longestCommonPrefix(String[] strs) {
        String s="";
        int judge=1;
        if(strs.length==0){//����Ϊ��ֱ�ӷ���""
            return s;
        }
        for(int i=0;i<strs[0].length();i++){
            char a=strs[0].charAt(i);//ֱ��ѡ���һ������Ԫ�أ�����ȡ����ַ������ַ�
            
            for(int j=0;j<strs.length;j++){
                
                if(i>=strs[j].length()){//��Ϊÿ���ַ������Ȳ�ͬ����ֹ���
                    judge=0;
                    break;
                }
                
                if(a!=strs[j].charAt(i)){
                    judge=0;//ֻҪ���ڲ�ͬ��ֱ���˳�
                    break;
                }
                
                else{
                    if(j==strs.length-1){
                        s=s+a;
                    }
                }               
            }
            if(judge==0){
                break;
            }
        }   
        return s;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str ={"flower","flow","flight"};
		Nine nine = new Nine();
		System.out.println("bb"+nine.longestCommonPrefix(str)+"aa");
	}

}
