package mgh.测试专用;

import java.util.Stack;

/**
* @author maguohao
* @version 创建时间：2018年9月5日 下午11:22:45
* 类说明:
* 问题1：反转一个只有3位数的整数。
* 样例
* 123 反转之后是 321。
* 900 反转之后是 9。
* 利用栈后入先出原理解决，网上没有这种解法，本人自创。
*/
public class test1 {

	public static void main(String[] args) {
		
		Integer num = reverseInteger(123456);
		System.out.println(num);

	}
	
	public static Integer reverseInteger(int number) {
        
        String str = number+"";
        
        Stack stack = new Stack();
        
        char[] ch = str.toCharArray();
        for(char c : ch){
            stack.push(c);
        }
        
        Stack stack2 = new Stack();
        String strF = "";
        while(!stack.empty()){
        	strF +=stack.pop().toString();
        }
        Integer n = Integer.valueOf(strF);
        return n;
 
}

}
