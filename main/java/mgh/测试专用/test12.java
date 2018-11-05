package mgh.测试专用;

import java.util.Stack;

/**
* @author maguohao
* @version 创建时间：2018年9月12日 下午4:25:56
* 类说明:
* 用堆栈实现 { 与 }  或[] 或 ()的检测
*/
public class test12 {

	public static void main(String[] args) {
		String str = "if((a==b) && (c==d)  || (x==y)) }";

		Stack<Character> stack = new Stack<Character>();
		for(int i =0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c == '(') {
				stack.push(c);//入栈
			}else if(c == ')') {
				try {
					stack.pop();//出栈
				}catch(Exception e) {
					System.out.println("少了左括号");
					return;
				}
			}
			if(c == '{') {
				stack.push(c);//入栈
			}else if(c == '}') {
				try {
					stack.pop();//出栈
				}catch(Exception e) {
					System.out.println("少了左括号");
					return;
				}
			}
		}
		
		if(stack.size() == 0) {
			System.out.println("语法正常");
		}else if(stack.size() > 0) {
			System.out.println("少了右括号");
		}
		
	}

}
