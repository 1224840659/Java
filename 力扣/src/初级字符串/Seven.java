package 初级字符串;
/*
 * 问题：实现 strStr() 函数。给定一个 haystack 字符串和一个 needle 字符串，
 * 		在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
 * 		如果不存在，则返回  -1。
 * 案例：输入: haystack = "hello", needle = "ll" 输出: 2
 * 
 * 思路1：两层for循环遍历 String1.startwith(String2)
 * 思路2：indexOf()//返回相等字符串的下标
 * */
public class Seven {
	//思路1
	public int strStr(String a, String b){
		if(b.equals(""))
			return 0;
		if(a.equals("")&&!b.equals(""))
			return -1;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)==b.charAt(0)){
				//startwith()判断函数a在某指定位置是不是以b开始的字符串
				if(a.substring(i).startsWith(b))
					return i;	
			}
		}		
	return -1;		
	}
	
	//思路2
    public static int strStr1(String haystack,String needle) {
        return haystack.indexOf(needle);
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String s1="ll";
		Seven seven = new Seven();
		System.out.println(seven.strStr(s, s1));
		System.out.println(seven.strStr1(s, s1));
		
	}

}
