package mgh.�����㷨.�ַ�������;

import java.util.Stack;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��5�� ����10:56:19
* ��˵��:
* �ַ���ͨ����ջʵ����������
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
