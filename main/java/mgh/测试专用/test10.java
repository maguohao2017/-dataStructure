package mgh.����ר��;

import java.util.Stack;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��12�� ����12:45:45
* ��˵��:
* ����ջʵ��һ������
* ��һ��ջֻ�������Ԫ�أ��ڶ���ջ�ڵ���Ԫ��ʱ�������жϵ�ǰջ�Ƿ�Ϊ�գ���Ϊ�վ�ֱ�ӽ����һ��ջ�е�����ȫ��ѹ��ڶ���ջ�У�
* Ȼ�����ջ��Ԫ�أ�����ʵ�ֶ���Ч�������ڶ���ջ�������ݣ����ֱ�ӽ�������ѹ���һ��ջ�У����ʱֱ������ڶ���ջ����Ԫ�ؼ��ɣ�
*/
public class test10 {

	public static void main(String[] args) {
		test10 sq = new test10();
		sq.push(1);
		sq.push(2);
		sq.push(3);
		sq.push(4);
		sq.push(5);
		
		System.out.println(sq.pop());
		System.out.println(sq.pop());
		System.out.println(sq.pop());
		System.out.println(sq.pop());
		System.out.println(sq.pop());
		
		sq.push(6);
		System.out.println(sq.pop());

	}
	
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	/*
	 * ���е�����ѹ�����
	 */
	public void push(Integer element){
		stack1.push(element);
	}
	
	/*
	 * ���е����ݵ�������
	 */
	public Integer pop(){
		if(stack2.size() <= 0){	//�ڶ���ջΪ��
			while(stack1.size() > 0){	//��һ��ջ��Ϊ��
				stack2.push(stack1.pop());	//�����һ��ջ������ѹ��ڶ���ջ��
			}
		}
		if(stack2.isEmpty()){
			try{
				throw new Exception("queue is empty");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		Integer head = stack2.pop();
		return head;
	}


}
