package mgh.��ջ.����ʵ��;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��12�� ����3:51:35
* ��˵��:
* ����ʵ�ֶ�ջ
*/
public class StackArray {

	//����
	private static Object[] data;
	
	//ջ����־λ��
	private static int top = -1;
	
	public StackArray() {
		data = new Object[100];
	}
	
	public StackArray(int size) {
		data = new Object[size];
	}
	
	//�ж�Ϊ�յĺ���
	public static boolean isEmpty() {
		boolean flag = false;
		if(top == -1) {
			flag = true;
		}
		return flag;
	}
	
	//�ж϶�ջ�Ƿ�����
	public static boolean isFull() {
		boolean flag = false;
		if(top == data.length - 1) {
			flag = true;
		}
		return flag;
	}
	
	//��ջ����
	public static void push(String param) {
		
		if(isFull()) {
			System.out.println("��ջ����"); 
			return;
		} 
		
		top++;
		data[top] = param;
	}
	
	//��ջ
	public static Object pop() {
		if(isEmpty()) {
			System.out.println("��ջ�ѿ�");
			return null;
		}
		return data[top--];
	}
	
	//��ȡջ��Ԫ��
	public static Object peek() {
		if(isEmpty()) {
			System.out.println("��ջ�ѿ�");
			return null;
		}
		return data[top];
	}
	
	//���ض�ջ��С
	public static int size() {
		return top + 1;
	}
	
	//���ض�ջ����
	public static int capacity() {
		return data.length;
	}
	
	//����Ԫ��
	public static void search(String s) {
		for(int i=0;i<=top;i++) {
			if(data[i].toString().equals(s)) {
				System.out.println("�ڵ�" + (i+1) + "λ���ҵ���" + s);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		StackArray stack = new StackArray(5);
		stack.push("�鳤");
		stack.push("���ž���");
		stack.push("����");
		stack.push("�ܾ���");
		stack.push("���³�");
		stack.push("��һ�����³�");
		
		System.out.println("ջ��Ԫ�أ� "+ stack.peek());
		System.out.println("------------------------------>sizeΪ�� " + stack.size());
		
		while(!stack.isEmpty()) {
			System.out.println("ȡ����Ԫ��Ϊ�� "+stack.pop());
		}
		
		System.out.println("------------------------------>sizeΪ�� " + stack.size());
		

	}

}
