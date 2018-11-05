package mgh.测试专用;
/**
* @author maguohao
* @version 创建时间：2018年9月12日 上午12:13:43
* 类说明:
* 两个字符串s和t，全部都由小写字母组成，其中t是由s打乱顺序并在随机一个位置添加了一个字符。找出这个字符。
* 例s="abcdf"
* t="abcdefg"
* （1）通过计数。用count[26]数组记录26个字母出现的次数，统计s时候做加法，统计t的时候做减法，最后为-1的就是解。（直接访问，很快）
* （2）用的异或,除了t多的那个字符外，都可以在异或中消除
* （3）可以直接用java自带的contains函数判断s中是否有这个字母。但是这个方法仅限于添加的这个字母之前在字符串s中没有出现过（即就是针对题目给的test设计的一个投机取巧的例子），所以很显然不行。但是还是贴出来，记录一下自己的思路历程！return的那个‘1’是随便定义的。
*/
public class test8 {

	public static void main(String[] args) {
		char ch = findTheDifference("ee", "eee");
		System.out.println(ch);
		System.out.println("--------方法二分割线---------");
		char ch2 = findTheDifference2("aac", "baac");
		System.out.println(ch2);
		System.out.println("--------方法三分割线---------");
		char ch3 = findTheDifference3("a", "ab");
		System.out.println(ch3);
		

	}
	
	public static char findTheDifference(String s,String t) {
		
		int[] ss = new int[26];
		int[] tt = new int[26];
		
		for(int i=0;i<s.length();i++) {
			ss[s.charAt(i) - 'a']++;
		}
		for(int i=0;i<t.length();i++) {
			tt[t.charAt(i) - 'a']++;
		}
		
		for(int i=0;i<26;i++) {
			
			if(ss[i]!=tt[i]) {
				return (char)('a' + i);
			}
		}
		return 0;
	}
	
	public static char findTheDifference2(String s, String t) {
        char tmp = 0x00;
        for(int i=0;i<s.length();i++)
            tmp =(char)( tmp ^ s.charAt(i));
        for(int i=0;i<t.length();i++)
            tmp = (char)(tmp ^ t.charAt(i));
        return tmp;
    }
	
	public static char findTheDifference3(String s, String t) {
		for(int i = 0; i < t.length(); i++){
    	   s.contains(String.valueOf(t.charAt(i)));
    	   if( !s.contains(String.valueOf(t.charAt(i)))){
    		   return t.charAt(i);
    	   }   
       }
        return '1';
    }


}
