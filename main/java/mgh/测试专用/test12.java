package mgh.����ר��;

import java.util.Stack;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��12�� ����4:25:56
* ��˵��:
* �ö�ջʵ�� { �� }  ��[] �� ()�ļ��
*/
public class test12 {

	public static void main(String[] args) {
		String str = "if((a==b) && (c==d)  || (x==y)) }";

		Stack<Character> stack = new Stack<Character>();
		for(int i =0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c == '(') {
				stack.push(c);//��ջ
			}else if(c == ')') {
				try {
					stack.pop();//��ջ
				}catch(Exception e) {
					System.out.println("����������");
					return;
				}
			}
			if(c == '{') {
				stack.push(c);//��ջ
			}else if(c == '}') {
				try {
					stack.pop();//��ջ
				}catch(Exception e) {
					System.out.println("����������");
					return;
				}
			}
		}
		
		if(stack.size() == 0) {
			System.out.println("�﷨����");
		}else if(stack.size() > 0) {
			System.out.println("����������");
		}
		
	}

}
