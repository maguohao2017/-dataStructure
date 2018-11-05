package mgh.堆栈;

import java.util.Stack;

/**
* @author maguohao
* @version 创建时间：2018年9月12日 上午10:10:32
* 类说明:
* 自定义堆栈demo
*/
public class myStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("组长");
		stack.push("部门经理");
		stack.push("副总");
		stack.push("总经理");
		stack.push("董事长");
		
		System.out.println("------------------------");
		System.out.println(stack.peek());
		System.out.println("大小为： "+stack.size());//大小
		System.out.println("容量为： "+stack.capacity());//容量
		
		System.out.println("------------------------");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println("------------------------");
		System.out.println("大小为： "+stack.size());//大小
		System.out.println("容量为： "+stack.capacity());//容量
	}
	
}
