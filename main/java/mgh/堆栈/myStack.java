package mgh.��ջ;

import java.util.Stack;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��12�� ����10:10:32
* ��˵��:
* �Զ����ջdemo
*/
public class myStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("�鳤");
		stack.push("���ž���");
		stack.push("����");
		stack.push("�ܾ���");
		stack.push("���³�");
		
		System.out.println("------------------------");
		System.out.println(stack.peek());
		System.out.println("��СΪ�� "+stack.size());//��С
		System.out.println("����Ϊ�� "+stack.capacity());//����
		
		System.out.println("------------------------");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println("------------------------");
		System.out.println("��СΪ�� "+stack.size());//��С
		System.out.println("����Ϊ�� "+stack.capacity());//����
	}
	
}
