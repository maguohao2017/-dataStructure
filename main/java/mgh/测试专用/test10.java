package mgh.测试专用;

import java.util.Stack;

/**
* @author maguohao
* @version 创建时间：2018年9月12日 上午12:45:45
* 类说明:
* 两个栈实现一个队列
* 第一个栈只负责添加元素，第二个栈在弹出元素时，首先判断当前栈是否为空，若为空就直接将其第一个栈中的数据全部压入第二个栈中，
* 然后输出栈顶元素，即可实现队列效果；若第二个栈中有数据，添加直接将其数据压入第一个栈中，输出时直接输出第二个栈顶的元素即可！
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
	 * 队列的数据压入过程
	 */
	public void push(Integer element){
		stack1.push(element);
	}
	
	/*
	 * 队列的数据弹出过程
	 */
	public Integer pop(){
		if(stack2.size() <= 0){	//第二个栈为空
			while(stack1.size() > 0){	//第一个栈不为空
				stack2.push(stack1.pop());	//将其第一个栈的数据压入第二个栈中
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
