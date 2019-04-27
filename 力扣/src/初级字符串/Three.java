package 初级字符串;
/* 
 * 问题：给定一个字符串，找到它的第一个不重复的字符，并返回它的索引，如果不存在，则返回-1.
 * 		假定字符串只有小写字母。
 * 例子：s = "loveleetcode",返回 2.
 * 
 * 思路：额外空间数组长度为26，分别记录每个字符出现的次数
 * 定义一个int类型数组，长度为26即26个字母，用于记录 stirng中字符出现的次数
 * */
public class Three {
	public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();//变成字符数组
        int len = chars.length;
        //定义数组长度为26，表示26个字母   0-25  分别表示a-z的位置
        int[] arr = new int[26];
        int count = 1;
        //遍历字符数组，任何一个字母出现一次，都在arr数组对应位置加1
        for(int i = 0;i<len;i++) {
            arr[chars[i] - 'a'] += count;
        }
        for(int i = 0;i<len;i++) {
            if(arr[chars[i] - 'a'] == 1) return i;
        }
        return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "loveleetcode";
		Three three =new Three();
		int i=three.firstUniqChar(a);
		System.out.println(i);
	}

}
