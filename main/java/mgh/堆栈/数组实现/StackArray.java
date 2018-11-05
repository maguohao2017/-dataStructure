package mgh.堆栈.数组实现;
/**
* @author maguohao
* @version 创建时间：2018年9月12日 下午3:51:35
* 类说明:
* 数组实现堆栈
*/
public class StackArray {

	//数组
	private static Object[] data;
	
	//栈顶标志位置
	private static int top = -1;
	
	public StackArray() {
		data = new Object[100];
	}
	
	public StackArray(int size) {
		data = new Object[size];
	}
	
	//判断为空的函数
	public static boolean isEmpty() {
		boolean flag = false;
		if(top == -1) {
			flag = true;
		}
		return flag;
	}
	
	//判断堆栈是否已满
	public static boolean isFull() {
		boolean flag = false;
		if(top == data.length - 1) {
			flag = true;
		}
		return flag;
	}
	
	//入栈操作
	public static void push(String param) {
		
		if(isFull()) {
			System.out.println("堆栈已满"); 
			return;
		} 
		
		top++;
		data[top] = param;
	}
	
	//出栈
	public static Object pop() {
		if(isEmpty()) {
			System.out.println("堆栈已空");
			return null;
		}
		return data[top--];
	}
	
	//获取栈顶元素
	public static Object peek() {
		if(isEmpty()) {
			System.out.println("堆栈已空");
			return null;
		}
		return data[top];
	}
	
	//返回堆栈大小
	public static int size() {
		return top + 1;
	}
	
	//返回堆栈容量
	public static int capacity() {
		return data.length;
	}
	
	//查找元素
	public static void search(String s) {
		for(int i=0;i<=top;i++) {
			if(data[i].toString().equals(s)) {
				System.out.println("在第" + (i+1) + "位置找到了" + s);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		StackArray stack = new StackArray(5);
		stack.push("组长");
		stack.push("部门经理");
		stack.push("副总");
		stack.push("总经理");
		stack.push("董事长");
		stack.push("另一个董事长");
		
		System.out.println("栈顶元素： "+ stack.peek());
		System.out.println("------------------------------>size为： " + stack.size());
		
		while(!stack.isEmpty()) {
			System.out.println("取出的元素为： "+stack.pop());
		}
		
		System.out.println("------------------------------>size为： " + stack.size());
		

	}

}
