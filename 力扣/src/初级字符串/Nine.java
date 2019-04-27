package 初级字符串;
/*问题：编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 案例：输入: ["flower","flow","flight"]输出: "fl"
 * 
 * 思路：
 * */
public class Nine {
	public String longestCommonPrefix(String[] strs) {
        String s="";
        int judge=1;
        if(strs.length==0){//数组为空直接返回""
            return s;
        }
        for(int i=0;i<strs[0].length();i++){
            char a=strs[0].charAt(i);//直接选择第一个数组元素，依次取这个字符串的字符
            
            for(int j=0;j<strs.length;j++){
                
                if(i>=strs[j].length()){//因为每个字符串长度不同，防止溢出
                    judge=0;
                    break;
                }
                
                if(a!=strs[j].charAt(i)){
                    judge=0;//只要存在不同，直接退出
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
