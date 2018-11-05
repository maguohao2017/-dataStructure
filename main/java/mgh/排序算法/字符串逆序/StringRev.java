package mgh.排序算法.字符串逆序;

import java.util.Stack;

/**
* @author maguohao
* @version 创建时间：2018年9月5日 上午10:56:19
* 类说明:
* 字符串通过堆栈实现逆序排序
*/
public class StringRev {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		String str = "my name is maguohao!";
		
		char[] ch = str.toCharArray(); 
		for(char c : ch) {
			stack.push(c);
		}
		
		while(!stack.empty())
			System.out.print(stack.pop());

	}
	
}
